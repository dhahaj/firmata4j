package org.firmata4j;

import java.util.ArrayList;
import java.util.List;

import com.fazecast.jSerialComm.SerialPort;

public class SerialPortList {

	public static List<String> getPortList() {
		java.util.List<String> portsList = new ArrayList<String>();
		for (SerialPort portName : SerialPort.getCommPorts()) {
			String name = portName.getSystemPortName();
			portsList.add(name);
		}
		return portsList;
	}

}
