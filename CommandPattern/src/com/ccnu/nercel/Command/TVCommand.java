package com.ccnu.nercel.Command;

import com.ccnu.nercel.HouseholdAppliances.TV;

public class TVCommand implements Command {
	
	private TV tv;
	
	public TVCommand(TV tv) {
		this.tv=tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.off();
	}

}
