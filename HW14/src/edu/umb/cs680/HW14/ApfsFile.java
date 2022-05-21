package edu.umb.cs680.HW14;

import java.time.LocalDateTime;

public class ApfsFile extends ApfsElement
{
	public ApfsFile(ApfsDirectory parent, String name, int size, LocalDateTime createdTime, String ownerName,LocalDateTime lastModified) 
	{
		super(parent, name, size, createdTime, ownerName, lastModified);
		parent.appendChild(this);
	}

	public boolean isDirectory() 
	{
		return false;
	}
	
	public boolean isFile() 
	{
		return true;
	}

	public boolean isLink() 
	{
		return false;
	}
	
	public static void main(String[]args)
	{
		System.out.println("The apfs file class has been sucessfully created");
	}
}