package edu.umb.cs680.HW6;

import java.util.LinkedList;

public class FileSystem {
	
	private static FileSystem instance = null;
	private LinkedList<Directory> rootD = new LinkedList<Directory>();

	public static FileSystem getFileSystem() {
		if (instance == null)
			instance = new FileSystem();
		return instance;
	}

	public LinkedList<Directory> getRootDirs() {
		return this.rootD;
	}

	public void appendRootDir(Directory root) {
		rootD.add(root);
	}
	public static void main(String[]args) 
	{
		System.out.println("The file system has been successfully created");
	}
}