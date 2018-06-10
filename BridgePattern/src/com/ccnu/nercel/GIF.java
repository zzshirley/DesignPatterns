package com.ccnu.nercel;

public class GIF extends Image{

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		Matrix m=new Matrix();
		imageimp.doPaint(m);
		System.out.println(fileName +",GIF格式");
	}

}
