package org.jugbd.marathon.day4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directory {
	private String name;
	private Date createdDate;
	private List<File> files = new ArrayList<>();

	public Directory(String root) {
		this.name = root;
		this.createdDate = new Date();
	}

	public void add(File file) {
		files.add(file);
	}

	public int numberOfFiles() {
		return files.size();
	}

	public Object getName() {
		return name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
}
