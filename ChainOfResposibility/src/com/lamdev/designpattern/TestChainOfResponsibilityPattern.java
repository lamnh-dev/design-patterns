package com.lamdev.designpattern;

public class TestChainOfResponsibilityPattern {

	public static void main(String[] args) {
		File videoFile = new File("video", "Restful API", "https://udemy.com/courses/restful-api");
		Handler textHandler = new TextFileHandler("Text");
		Handler excelHander = new ExcelFileHandler("Excel");
		Handler audioHandler = new AudioFileHandler("Audio");
		Handler videoHandler = new VideoFileHandler("Video");
		Handler imageHandler = new ImageFileHandler("Image");
		
		textHandler.setHandler(excelHander);
		excelHander.setHandler(audioHandler);
		audioHandler.setHandler(videoHandler);
		videoHandler.setHandler(imageHandler);
		
		textHandler.process(videoFile);
	}

}
