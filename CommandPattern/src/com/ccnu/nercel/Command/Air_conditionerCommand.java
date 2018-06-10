package com.ccnu.nercel.Command;

import com.ccnu.nercel.HouseholdAppliances.Air_conditioner;

public class Air_conditionerCommand implements Command{
	
	private Air_conditioner air_conditioner;
	
	public Air_conditionerCommand(Air_conditioner air_conditioner) {
		this.air_conditioner=air_conditioner;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		air_conditioner.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		air_conditioner.off();
	}

}
