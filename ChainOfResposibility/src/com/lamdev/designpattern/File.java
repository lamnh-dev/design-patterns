package com.lamdev.designpattern;

public class File {
	
	private final String fileType;
	private final String fileName;
	private final String filePath;
	
	public File(String fileType, String fileName, String filePath) {
		super();
		this.fileType = fileType;
		this.fileName = fileName;
		this.filePath = filePath;
	}
	public String getFileType() {
		return fileType;
	}
	public String getFileName() {
		return fileName;
	}
	public String getFilePath() {
		return filePath;
	}
}
