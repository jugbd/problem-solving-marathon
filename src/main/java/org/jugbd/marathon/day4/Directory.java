package org.jugbd.marathon.day4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directory extends FileSystemComponent {
	private String name;
	private Date createdDate;
	private List<FileSystemComponent> files = new ArrayList<>();

	public Directory(String root) {
		if (root == null || root.isEmpty()) {
			throw new IllegalArgumentException(
					"Directory name shouldn't be null or empty string");
		}
		this.name = root;
		this.createdDate = new Date();
	}

	@Override
	public void add(FileSystemComponent fileComponent) {
		if (files.contains(fileComponent)) {
			throw new IllegalArgumentException(fileComponent.getName()
					+ " already exists in " + this.getName() + " directory");
		} else if (fileComponent.hashCode() == this.hashCode()
				&& fileComponent.getName().equals(this.getName())) {
			throw new IllegalArgumentException(
					"A parent directory can't hold itself as its child component");
		}
		files.add(fileComponent);
	}

	@Override
	public int numberOfFiles() {
		return files.size();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Date getCreatedDate() {
		return createdDate;
	}
}
