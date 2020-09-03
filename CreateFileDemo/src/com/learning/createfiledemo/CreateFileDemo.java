package com.learning.createfiledemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileDemo {

	public static void main(String[] args) {
		Path path=Paths.get("E:\\Online Sessions\\Java Morning 9-11\\testfile.txt");
		try {
			Files.createFile(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
