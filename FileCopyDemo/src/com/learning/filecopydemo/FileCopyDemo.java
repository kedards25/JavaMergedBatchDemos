package com.learning.filecopydemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyDemo {

	public static void main(String[] args) {
		Path srcPath=Paths.get("E:\\Online Sessions\\Java Morning 9-11\\testfile.txt");
		
		try {
			Files.delete(srcPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
