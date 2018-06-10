package com.ccnu.nercel;

public class BMP extends Image{
	
	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		Matrix m=new Matrix();
		imageimp.doPaint(m);
		System.out.println(fileName +",BMP格式");
	}
	
}
