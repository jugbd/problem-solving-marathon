package org.jugbd.marathon.day4;

import java.util.Date;

public abstract class FileSystemComponent {

	public String getName() {
		throw new UnsupportedOperationException();
	}

	public int numberOfFiles() {
		throw new UnsupportedOperationException();
	}

	public void add(FileSystemComponent fileSystemComponent) {
		throw new UnsupportedOperationException();
	}

	public Date getCreatedDate() {
		throw new UnsupportedOperationException();
	}
}
