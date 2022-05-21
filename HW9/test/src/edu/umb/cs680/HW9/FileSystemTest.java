package edu.umb.cs680.HW9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import edu.umb.cs680.HW9.apfs.*;
import java.time.LocalDateTime;

class FileSystemTest {
	LocalDateTime localTime = LocalDateTime.now();
	Apfs ApfsFileSystem = Apfs.getApfsFileSystem();
	ApfsDirectory root = (ApfsDirectory) ApfsFileSystem.initFileSystem("Apfs", 500);
	ApfsDirectory applications = new ApfsDirectory(root, "applications", 0, localTime,"ApfsFile",localTime);
	ApfsDirectory home = new ApfsDirectory(root, "home", 0, localTime,"ApfsFile",localTime);
	ApfsDirectory code = new ApfsDirectory(home, "code", 0, localTime,"ApfsFile",localTime);
	ApfsFile a = new ApfsFile(applications, "a", 10, localTime,"ApfsFile",localTime);
	ApfsFile b = new ApfsFile(applications, "b", 15, localTime,"ApfsFile",localTime);
	ApfsFile c = new ApfsFile(home, "c", 20, localTime,"ApfsFile",localTime);
	ApfsFile d = new ApfsFile(home, "d", 30, localTime,"ApfsFile",localTime);
	ApfsFile e = new ApfsFile(code, "e", 40, localTime,"ApfsFile",localTime);
	ApfsFile f = new ApfsFile(code, "f", 50, localTime,"ApfsFile",localTime);
	ApfsLink x = new ApfsLink(home, "x", 0, localTime, "ApfsFile", localTime, applications);
	ApfsLink y = new ApfsLink(code, "y", 0, localTime,"ApfsFile",localTime,b);
	
	private String[] ApfsDirToStringArray(ApfsDirectory d) {
		String parentName = null;
		ApfsDirectory parent = d.getParent();
		if (parent != null) {
			parentName = parent.getName();
		}
		String[] dirInfo = { parentName,Boolean.toString(d.isDirectory()), d.getName(), Integer.toString(d.getSize()),d.getCreationTime().toString(),
					Integer.toString(d.getTotalSize()), Integer.toString(d.countChildren()),
					ApfsFileSystem.getFileSystemName(), Integer.toString(ApfsFileSystem.getCapacity()), d.getOwnerName(),
					d.getLastModified().toString() };
		return dirInfo;
	}
	
	@Test
	public void verifyDirectoryEqualityRoot() {
		String[] expected = { null,"true", "root", "0", localTime.toString(),"165", "2", "Apfs", "500", "ApfsFile",localTime.toString() };
		ApfsDirectory actual = root;
		assertArrayEquals(expected, ApfsDirToStringArray(actual));
	}
	
	@Test
	public void verifyDirectoryEqualityHome() {
		String[] expected = {"root", "true", "home", "0", localTime.toString(),"140", "4", "Apfs", "500", "ApfsFile",localTime.toString() };
		ApfsDirectory actual = home;
		assertArrayEquals(expected, ApfsDirToStringArray(actual));
		}
}