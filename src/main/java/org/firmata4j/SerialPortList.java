package org.firmata4j;

import java.util.ArrayList;
import java.util.List;

import com.fazecast.jSerialComm.SerialPort;

/**
 * Convenience class to get a list of available serial ports.
 */
public class SerialPortList {

	/**
	 * Returns a {@link List} of available serial ports.
	 *
	 * @return a list of available serial ports
	 */
	public static List<String> getPortList() {
		java.util.List<String> portsList = new ArrayList<String>();
		for (SerialPort portName : SerialPort.getCommPorts()) {
			String name = portName.getSystemPortName();
			portsList.add(name);
		}
		return portsList;
	}

}
