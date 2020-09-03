package com.learning.pathdemo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {

		Path path=Paths.get("E:\\Online Sessions\\Java\\sampleFile.txt");
		//root element is considered to be at 0
		//System.out.println("No of subpaths: "+path.getNameCount());
		//System.out.println(path.getName(1));
		//System.out.println("File System"+path.getFileSystem());
		//System.out.println(path.getParent());
		//System.out.println("Root Path "+path.getRoot());
		System.out.println("Is Absolute: "+path.isAbsolute());
	}

}
