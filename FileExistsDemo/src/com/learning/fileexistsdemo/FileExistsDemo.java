package com.learning.fileexistsdemo;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExistsDemo {

	public static void main(String[] args) {
//		Path path=Paths.get("E:\\Online Sessions\\Java Morning 9-11\\testfile.txt");
//		boolean fileExists=Files.exists(path, LinkOption.NOFOLLOW_LINKS);
//		System.out.println(fileExists);
		
		Path path=Paths.get("E:\\Online Sessions\\Java Morning 9-11\\testfile.txt");
		boolean fileExists=Files.notExists(path, LinkOption.NOFOLLOW_LINKS);
		System.out.println(fileExists);	

	}

}
