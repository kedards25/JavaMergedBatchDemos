package com.learning.filemovedemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMoveDemo {

	public static void main(String[] args) {
		Path srcPath=Paths.get("E:\\Online Sessions\\Java Morning 9-11\\testfile.txt");
		Path trgtPath=Paths.get("E:\\Online Sessions\\testfile.java");
		
		try {
			Files.move(srcPath, trgtPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
