package application;

import java.util.List;

public class ManufacturingStatioin {
	
	private int stationID;
	private List<String> sensorData;
	
	
	
	public int getStationID() {
		return stationID;
	}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}
	public List<String> getSensorData() {
		return sensorData;
	}
	public void setSensorData(List<String> sensorData) {
		this.sensorData = sensorData;
	}
}
