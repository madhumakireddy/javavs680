package edu.umb.cs680.HW9.apfs;

public interface ApfsFSVisitor 
{
	public void visit(ApfsLink link);
	public void visit(ApfsDirectory dir);
	public void visit(ApfsFile file);
	
	public static void main(String [] args)
	{
		System.out.println("The Apfs-FS-Visitor has been sucessfully created");
	}
}