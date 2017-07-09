package org.jugbd.marathon.day4;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

import java.util.Date;

import org.junit.Test;

public class FileSystemTest {

	@Test
	public void basicTest() {
		String rootDirectoryName = "root";
		Directory root = new Directory(rootDirectoryName);
		assertNotNull(root);
		assertEquals(rootDirectoryName, root.getName());

		String fileName = "profile.jpg";
		File file = new File(fileName);
		assertNotNull(file);

		assertEquals(fileName, file.getName());

		root.add(file);
		assertEquals(1, root.numberOfFiles());

		Date createdDate = root.getCreatedDate();
		assertNotNull(createdDate);
		
		FileSystemComponent dir2 = new Directory("Dir2");
		root.add(dir2);
		assertEquals(2, root.numberOfFiles());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDuplicateFileExistance() {
		FileSystemComponent root = new Directory("root");
		File file = new File("profile.jpg");
		root.add(file);
		root.add(file);
		assertEquals(1, root.numberOfFiles());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyOrNullDirectoryName(){
		new Directory(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyOrNullFileName(){
		new File("");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testParentAsAChild(){
		FileSystemComponent root = new Directory("root");
		root.add(root);
	}
	
	
}