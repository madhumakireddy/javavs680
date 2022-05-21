package edu.umb.cs680.HW9.apfs;

public class ApfsFileSearchVisitor implements ApfsFSVisitor
{
	private String fileName;
	private ApfsFile file;

	public void visit(ApfsFile file) 
	{
		if (fileName.equals(file.getName()))
			this.file = file;
	}
	
	public ApfsFile getFile() 
	{
		return file;
	}

	public void setFileName(String fileName) 
	{
		this.fileName = fileName;
	}

	public void visit(ApfsDirectory dir) 
	{
		return;
	}

	public void visit(ApfsLink link) 
	{
		return;
	}
	
	public static void main(String [] args)
	{
		System.out.println("The Apfs search visitor has been sucessfully created");
	}
}