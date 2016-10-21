package filehandling;

import java.io.*;


public class FileMain {
	
	
	public static void writeFile() throws IOException{
		File f = new File("abc.txt");
		FileOutputStream out = new FileOutputStream(f);
		String message = "Good Morning................";
		out.write(message.getBytes());
	}
	public static void readFile() throws IOException{
		File f  = new File("abc.txt");
		FileInputStream fin = new FileInputStream(f);
		StringBuilder sb =new StringBuilder();
		int i = 0;
		do{
			i = fin.read();
			if(i != -1){
				sb.append((char)i);				
			}
			
		}while(i != -1);
		System.out.println("File contents "+sb);		
				
		
	}
	public static void writeAnFile() throws IOException{
		File fo = new File("pqr.txt");
		File fi  = new File("abc.txt");
		
		FileInputStream fin = new FileInputStream(fi);
		FileOutputStream out = new FileOutputStream(fo);
		StringBuilder b = new StringBuilder("");
		
		int i = 0;
		do{
			i = fin.read();
			if(i != -1){
				b.append((char)i);
			}
		}while(i != -1);
				
		String k = b.toString();
		out.write(k.getBytes());
		
	}
	public static void fileInfo(String name)
	{
		File f = new File(name);
		System.out.println("Name of File is"+	f.getName());
		System.out.println("Can execute " +f.canExecute()+"\nCan Read "+f.canRead()+"\nCan write "+f.canWrite());
		System.out.println("Location of file is "+f.getAbsolutePath());
		
	}
	public static void writeAccount(String name) throws IOException{
		File f  = new File(name);
		FileOutputStream out = new FileOutputStream(f); 
		DataOutputStream dos = new DataOutputStream(out);
		
		dos.writeInt(123);
		dos.writeDouble(50000.56);
		dos.writeUTF("ravi");
		dos.flush();
		out.flush();
		
	}
	public static void ReadAccount(String name) throws IOException{
		File f  = new File(name);
		FileInputStream out = new FileInputStream(f); 
		DataInputStream dos = new DataInputStream(out);
		int id = dos.readInt();
		double d = dos.readDouble();
		String n = dos.readUTF();
		System.out.println(id+" "+d+" "+n);
	}
	public static void sequenceRead(String f1,String f2) throws IOException{

		InputStream file1 = new FileInputStream(f1);
		InputStream file2 = new FileInputStream(f2);
	//	SequenceInputStream seq = new SequenceInputStream(file1,file2,file3);
		SequenceInputStream sequenceInputStream =
			    new SequenceInputStream(file1, file2);
		int data = sequenceInputStream.read();
		
		while(data != -1){
		    System.out.println(data);
		    data = sequenceInputStream.read();
		}
		
		
	}

	public static void main(String[] args) throws IOException {
				writeFile();
				readFile();
				writeAnFile();
				fileInfo("abc.txt");
				writeAccount("abc.txt");
				ReadAccount("abc.txt");
				sequenceRead("abc.txt","pqr.txt");

	}

}
