package com.learning.filedeletedemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDeleteDemo {

	public static void main(String[] args) {
		Path srcPath=Paths.get("E:\\Online Sessions\\Java Morning 9-11"
				+ "\\testfile.txt");
		
		//types of exceptions which can be thrown
		//NoSuchFileException:if file does not exist
		//DirectoryNotEmptyException:iF directory to be deleted is not empty
		//IOException:IO error
		//SecurityException:if Permission to delete the file is denied
		
		
//		try {
//			Files.delete(srcPath);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		}
		
		try {
		Files.deleteIfExists(srcPath);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}

	}

}
