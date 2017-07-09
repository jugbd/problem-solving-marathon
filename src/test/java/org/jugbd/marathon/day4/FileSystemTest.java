package org.jugbd.marathon.day4;


import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

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

        //Add more test cases
    }
}