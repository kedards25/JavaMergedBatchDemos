package com.learning.pathmatcherdemo;

import java.beans.Visibility;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

import org.w3c.dom.css.Counter;

public class PathMatcherDemo implements FileVisitor {

	private final PathMatcher matcher;
	int counter=0;
	
	public PathMatcherDemo(String pattern) {
		FileSystem fs=FileSystems.getDefault();
		matcher=fs.getPathMatcher("glob: "+pattern);
	}
	
	void search(Path path)throws IOException
	{
		Path name=path.getFileName();
		if(name!=null && matcher.matches(name))
		{
			System.out.println("File to be searched: "+name+
					" and file found at: "+path.getParent().toAbsolutePath());
			counter++;
		}
	}
	

	@Override
	public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		return FileVisitResult.CONTINUE;	
		}
	
public static void main(String[] args) {
		
		try {
			String pattern="*.java";
			Path fileTree=Paths.get("E:\\Online Sessions\\Java Morning 9-11\\");
			PathMatcherDemo demo=new PathMatcherDemo(pattern);
			EnumSet opts=EnumSet.of(FileVisitOption.FOLLOW_LINKS);
			Files.walkFileTree(fileTree,opts,Integer.MAX_VALUE, demo);
			System.out.println("Total files found: "+demo.counter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
