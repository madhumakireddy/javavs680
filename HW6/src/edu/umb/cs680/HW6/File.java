package edu.umb.cs680.HW6;

import java.time.LocalDateTime;


public class File extends FSElement {
	
	public File(Directory parent, String name, int size, LocalDateTime createdTime) {
		super(parent,name, size, createdTime);
		parent.appendChild(this);
	}
	public boolean isDirectory() {
		return false;
	}
	public boolean isFile() {
		return true;
	}
	public static void main(String[]args) 
	{
		System.out.println("The file has been successfully created");
	}
}