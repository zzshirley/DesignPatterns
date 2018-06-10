package com.ccnu.nercel;

public abstract class Image {
	protected ImageImp imageimp;
	protected void setImp(ImageImp imageimp) {
		this.imageimp=imageimp;		
	}
	public abstract void parseFile(String fileName);
}
