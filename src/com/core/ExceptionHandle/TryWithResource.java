package com.core.ExceptionHandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResource {
	public static void main(String[] args) {
		try {
			printFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//printFile1();
	}

	private static void printFile1() {
		//InputStream input=null;
		try(FileInputStream input=new FileInputStream("chandu1.txt")) {
			//input=new FileInputStream("chandu.txt");
			int data=input.read();
			while(data!=-1){
				System.out.print((char) data);
	            data = input.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void printFile() throws IOException {
		InputStream input=null;
		
			input=new FileInputStream("chandu1.txt");
			int data=input.read();
			while(data!=-1){
				System.out.print((char) data);
	            data = input.read();
			}
		
		
		
	}

}
