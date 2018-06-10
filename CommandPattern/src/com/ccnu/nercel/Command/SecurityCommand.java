package com.ccnu.nercel.Command;

import com.ccnu.nercel.HouseholdAppliances.Security;

public class SecurityCommand implements Command {
	private Security security;
	
	public SecurityCommand(Security security) {
		this.security=security;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		security.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		security.off();
	}

}
