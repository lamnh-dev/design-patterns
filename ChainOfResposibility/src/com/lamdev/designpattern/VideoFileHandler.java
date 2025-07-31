package com.lamdev.designpattern;

public class VideoFileHandler implements Handler{
	
	private Handler handler;
	private String handlerName;
	
	public VideoFileHandler(String handlerName) {
		this.handlerName = handlerName;
	}
	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
		
	}
	@Override
	public void process(File file) {
		if (file.getFileType().equals("video")) {
			System.out.println("Process and saving video file by ..." + getHandlerName());
		} else if (file.getFileType() != null) {
			System.out.println("Send file to " + handler.getHandlerName() + "handler" + " processing");
			handler.process(file);
		}
		
	}
	@Override
	public String getHandlerName() {
		return handlerName;
	}
}
