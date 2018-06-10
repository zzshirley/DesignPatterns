package com.ccnu.nercel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image=new BMP();
		ImageImp imageimp=new WinImp();
		image.setImp(imageimp);
		image.parseFile("hello.bmp");
	}
}
