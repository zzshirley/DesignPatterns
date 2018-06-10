package org.ccnu.nercel.concretion;
import org.ccnu.nercel.abstracts.AbstractFactory;
import org.ccnu.nercel.abstracts.Button;
import org.ccnu.nercel.abstracts.TextBox;

public class LinuxFactory extends AbstractFactory {
	
	public Button CreateButton() {
		return new LinuxButton();
	}
	
	public TextBox CreateTextBox() {
		return new LinuxTextBox();
	}

}
