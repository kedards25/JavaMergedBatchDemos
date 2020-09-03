package com.learning.traversingfiletreedemo;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class TraversingFileTreeDemo implements FileVisitor<Path> {

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.out.println("About to visit file: " + dir);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("Currently Visiting: " + file);
		System.out.println("Is this file a directory: " + Files.isDirectory(file));
		System.out.println("checking done");
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		System.out.println("Error occurred: " + exc.getMessage());
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Just Visited: " + dir);
		return FileVisitResult.CONTINUE;
	}

	public static void main(String[] args) {
		Path path = Paths.get("E:\\Online Sessions\\Java Morning 9-11\\testfile.txt");
		TraversingFileTreeDemo demo = new TraversingFileTreeDemo();
		try {
			Files.walkFileTree(path, demo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
