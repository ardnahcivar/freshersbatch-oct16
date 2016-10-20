package com.mypackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Closable implements AutoCloseable {

	public static void main(String[] args) throws IOException  {
		
		// TODO Auto-generated method stub
		try(FileReader f = new FileReader("ravi.txt")){
			char buffer[] = new char[1024];
			f.read(buffer);
			for(int i = 0;i<buffer.length;i++)
			{
				System.out.println(buffer[i]);
			}
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void close() throws Exception {
		
		
	}

}
