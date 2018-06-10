package com.ccnu.nercel.Command;

import com.ccnu.nercel.HouseholdAppliances.Camera;

public class CameraCommand implements Command {
	
	private Camera camera;
	
	public CameraCommand(Camera camera) {
		this.camera=camera;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		camera.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		camera.off();
	}

}
