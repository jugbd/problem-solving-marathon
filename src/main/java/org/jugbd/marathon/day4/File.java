package org.jugbd.marathon.day4;

public class File extends FileSystemComponent{
	private String name;

	public File(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException(
					"Directory name shouldn't be null or empty string");
		}
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
}
