package org.ccnu.nercel;

import org.ccnu.nercel.abstracts.AbstractFactory;

public class Application {
	
	/**
	 * 初始化，创建Button和TextBox
	 */
	public void init() {
		AbstractFactory factory = FactoryProducer.getFactory(getOsName());
		factory.CreateButton().DisplayButton();
		factory.CreateTextBox().DisplayTextBox();
	}
	
	/**
	 * 用随机数字判断系统
	 * @return Linux系统返回 "Linux", 否则返回 "Windows"
	 */
	public String getOsName() {		
		String osName = Math.random()>0.5 ? "linux" : "windows";
		return osName;	
		}
}
