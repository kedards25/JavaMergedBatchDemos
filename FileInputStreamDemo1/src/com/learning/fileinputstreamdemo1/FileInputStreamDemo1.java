package com.learning.fileinputstreamdemo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Stream;

public class FileInputStreamDemo1 {

	public static void main(String[] args) {
		//checked exception
		int i;
		char c;
//		FileInputStream stream=null;
		//this try with resources will eliminate the need of lengthy finally block
		//and will close the opened resource with help of Autoclosable interface
		//if you are opening more than one resources then have to separate them using ; and
		//resources will be closed in order opposite to which they were opened
		try (FileInputStream stream=new FileInputStream("E:\\Online Sessions\\Java Morning 9-11\\dummydocument.txt");)
			{		
			//checking if file is not null(empty)
			while((i=stream.read())!=-1)
			{
				//conversion of byte int into char
				c=(char)i;
				System.out.print(c);
			}
			
		} catch (FileNotFoundException e) {
			//will handle filepath errors
			System.out.println(e);
		} catch (IOException e) {
			//will handle accessibility errors
			System.out.println(e);
		}
//		finally {
//			//we may face an exception while closing the stream 
//			//hence compiler is prompting us to surround statement with try catch
//			try {
//				stream.close();
//			} catch (IOException e) {
//				System.out.println(e);
//			}
//		}

	}

}
