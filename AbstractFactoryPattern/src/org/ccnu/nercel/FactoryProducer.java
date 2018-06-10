package org.ccnu.nercel;

import org.ccnu.nercel.abstracts.AbstractFactory;
import org.ccnu.nercel.concretion.LinuxFactory;
import org.ccnu.nercel.concretion.WindowsFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String osName) {
		if("linux".equalsIgnoreCase(osName)) {
			return new LinuxFactory();
		}else if("windows".equalsIgnoreCase(osName)) {
			return new WindowsFactory();
		}
		return null;
	}

}

