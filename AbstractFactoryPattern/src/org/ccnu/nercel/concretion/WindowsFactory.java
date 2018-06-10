package org.ccnu.nercel.concretion;
import org.ccnu.nercel.abstracts.AbstractFactory;
import org.ccnu.nercel.abstracts.Button;
import org.ccnu.nercel.abstracts.TextBox;

public  class WindowsFactory extends AbstractFactory{
	
	public Button CreateButton() {
		return new WindowsButton();
	}
	
	public TextBox CreateTextBox() {
		return new WindowsTextBox();
	}

}
