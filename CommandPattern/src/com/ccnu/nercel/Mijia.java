package com.ccnu.nercel;

import java.util.Scanner;

import com.ccnu.nercel.Command.Air_conditionerCommand;
import com.ccnu.nercel.Command.CameraCommand;
import com.ccnu.nercel.Command.LightCommand;
import com.ccnu.nercel.Command.SecurityCommand;
import com.ccnu.nercel.Command.TVCommand;
import com.ccnu.nercel.HouseholdAppliances.Air_conditioner;
import com.ccnu.nercel.HouseholdAppliances.Camera;
import com.ccnu.nercel.HouseholdAppliances.Light;
import com.ccnu.nercel.HouseholdAppliances.Security;
import com.ccnu.nercel.HouseholdAppliances.TV;

public class Mijia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker invoker=new Invoker();
		System.out.println("请选择米家模式：\n 1.离家模式\n 2.回家模式\n 0.退出");
		Scanner console = new Scanner(System.in);
		String input = console.next();
		switch(input) {
		case "1":LeaveHome(invoker);
		         break;
		case "2":BackHome(invoker);
		         break;
		case "3":break;
		}
		
	}
	public static void LeaveHome(Invoker invoker) {
		System.out.println("-开启离家模式-");
		Light light = new Light("kitchen");
		Light light1 = new Light("livingroom");
		TV tv =new TV();
		Air_conditioner airconditioner=new Air_conditioner();
		Camera camera=new Camera();
		Security security=new Security();
		LightCommand lightcommand=new LightCommand(light);			
		LightCommand lightcommand1=new LightCommand(light1);
		TVCommand tvcommand=new TVCommand(tv);
		Air_conditionerCommand air_conditionercommand=new Air_conditionerCommand(airconditioner);
		CameraCommand cameracommand=new CameraCommand(camera);
		SecurityCommand securitycommand = new SecurityCommand(security);
		System.out.println("关闭家电..");
		invoker.setCommand(lightcommand);
		invoker.setCommand(lightcommand1);
		invoker.setCommand(tvcommand);
		invoker.setCommand(air_conditionercommand);
		invoker.undoCommand();
		System.out.println("开启安防和摄像头..");
		invoker.setCommand(cameracommand);
		invoker.setCommand(securitycommand);
		invoker.placeCommand();
	}
	public static void BackHome(Invoker invoker) {
		System.out.println("-开启回家模式-");
		Light light = new Light("kitchen");
		Light light1 = new Light("livingroom");
		TV tv =new TV();
		Air_conditioner airconditioner=new Air_conditioner();
		Camera camera=new Camera();
		Security security=new Security();
		LightCommand lightcommand=new LightCommand(light);			
		LightCommand lightcommand1=new LightCommand(light1);
		TVCommand tvcommand=new TVCommand(tv);
		Air_conditionerCommand air_conditionercommand=new Air_conditionerCommand(airconditioner);
		CameraCommand cameracommand=new CameraCommand(camera);
		SecurityCommand securitycommand = new SecurityCommand(security);
		System.out.println("打开家电..");
		invoker.setCommand(lightcommand);
		invoker.setCommand(lightcommand1);
		invoker.setCommand(tvcommand);
		invoker.setCommand(air_conditionercommand);
		invoker.placeCommand();
		System.out.println("关闭安防和摄像头..");
		invoker.setCommand(cameracommand);
		invoker.setCommand(securitycommand);
		invoker.undoCommand();
	}
}
