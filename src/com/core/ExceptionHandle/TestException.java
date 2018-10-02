package com.core.ExceptionHandle;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {
	public static void main(String[] args) {
		try {
			testException();
		} /*catch (IOException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	private static void testException() throws IOException,FileNotFoundException {
		
		
	}

}
