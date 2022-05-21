package edu.umb.cs680.HW7;

import java.time.LocalDateTime;

public class Link extends FSElement {
	
	private FSElement target;
	public Link(Directory parent, String name, int size, LocalDateTime creationTime, FSElement target) {
		super(parent, name, size, creationTime);
		this.target = target;
		parent.appendChild(this);
	}
	public FSElement getTarget() {
		return target;
	}

	public boolean isDirectory() {
		return false;
	}
	
	public boolean isLink() {
		return true;
	}
	
	public boolean isFile() {
		return false;
	}
	 public static void main(String[]args)
	    {
	    	System.out.println("The link has been sucessfully created");
	    }
}