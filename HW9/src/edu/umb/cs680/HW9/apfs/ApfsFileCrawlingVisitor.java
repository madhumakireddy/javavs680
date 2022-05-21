package edu.umb.cs680.HW9.apfs;

import java.util.LinkedList;

public class ApfsFileCrawlingVisitor implements ApfsFSVisitor {
	
private LinkedList<ApfsFile> files = new LinkedList<ApfsFile>();
	
	public LinkedList<ApfsFile> getFiles() {
		return files;
			
	}
	public void visit(ApfsLink link) {
		return;
	}
	
	public void visit(ApfsFile file) {
		files.add(file);
	}
	
	public void visit(ApfsDirectory dir) {
		return;
	}
	
	public static void main(String [] args)
	{
		System.out.println("The Apfs file crawling visitor has been sucessfully created");
	}

}