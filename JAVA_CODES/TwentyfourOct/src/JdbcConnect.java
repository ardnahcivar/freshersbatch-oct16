
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class JdbcConnect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		String query = "create table employee_copy as (select * from emp)";
		Statement stmt = con.createStatement();
		//stmt.executeQuery(query);
		
		String query2  = "create table picture(image_name blob)";
		/*stmt.executeQuery(query2);
		PreparedStatement pstmt = con.prepareStatement("insert into picture values(?)");
		File f = new File("C:/Users/bhanage_r/workspace/TwentyfourOct/Koala.jpg");
		FileInputStream fis = new FileInputStream(f);
		pstmt.setBinaryStream(1,fis,f.length());
		pstmt.executeUpdate();
		*/
		
		File o = new File("abc.jpg");
		String q3 = "select * from picture";
		
		ResultSet rs = stmt.executeQuery(q3);
		while(rs.next()){
			Blob b = rs.getBlob("image_name");
			byte byt[] = b.getBytes(1, (int)b.length());
			FileOutputStream ot = new FileOutputStream(o);
			ot.write(byt);
		}
		
		
	/*	PreparedStatement ps = con.prepareStatement("insert into emp(id,name,salary,commission,role,dept_no) values(?,?,?,?,?,?)");
		ps.setInt(1,9);
		ps.setString(2,"jack");
		ps.setInt(3, 123455);
		ps.setInt(4,543121);
		ps.setString(5, "MD");
		ps.setInt(6, 1);
		ps.addBatch();
		ps.executeBatch();
		*/
		
		
		
		
		
		
		
	}

}
