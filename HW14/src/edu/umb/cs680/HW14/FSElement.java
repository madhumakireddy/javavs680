package edu.umb.cs680.HW14;

import java.time.LocalDateTime;

public abstract class FSElement 
{	
	private String name;
	private int size;
	private LocalDateTime creationTime;
	private ApfsDirectory parent; 
	
	public FSElement(ApfsDirectory parent, String name, int size, LocalDateTime createdTime) 
	{
		this.parent = parent;
		this.name = name;
		this.size = size;
		this.creationTime = createdTime;
	}
	
	public String getName() 
	{
		return name;
	}
	public int getSize() 
	{
		return size;
	}
	public LocalDateTime getCreationTime() 
	{
		return creationTime;
	}
	public ApfsDirectory getParent() 
	{
		return parent;
	}
	
	public abstract boolean isDirectory();
	public abstract boolean isLink();
	public abstract boolean isFile();

	
	public void setParent(ApfsDirectory parent) 
	{
		this.parent = parent;
	}

	public static void main(String[]args)
	{
		System.out.println("The FSElement has been sucessfully created");
	}
}