package org.jugbd.marathon.day4;

import java.util.Date;
import java.util.ArrayList;

public class Directory {
	
	private String name;
    private Date createdDate;
    private ArrayList<Directory> directoryList; 
    private ArrayList<File> fileList; 

    public Directory(String root) {
    	
    	this.name = root;
    	this.createdDate = new Date();
    	this.directoryList = new ArrayList<>();
    	this.fileList = new ArrayList<>();
    }
    
    public void add(Directory directory) {

    	this.directoryList.add(directory);
    }

    public void add(File file) {

    	this.fileList.add(file);
    }
    
    public int getAllFileCounts(Directory dir) {
    	
    	if(dir.directoryList.size() == 0)
    		return dir.fileList.size();
    	
    	int length = dir.directoryList.size();
    	int sumOfFiles = 0;
    	
    	for(int i = 0; i < length; i++) {
    		
    		sumOfFiles += getAllFileCounts(dir.directoryList.get(i));
    	}
    	return sumOfFiles + dir.fileList.size();
    }

    public int numberOfFiles() {

        return getAllFileCounts(this);
    }

    public String getName() {
    	
        return name;
    }

    public Date getCreatedDate() {
    	
        return createdDate;
    }

}
