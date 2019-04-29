package Plane;

import Enumeration.Freight;
import Enumeration.Transport;

public abstract class Plane {
	
	private Transport typeOfTransportPlane;
	private Freight typeOfFreightPlane;
	private int numberOfTransporting;
	private int rangeOfFly;
	private int fuelConsumption;
		
	
	public void setTypeOfTransport(Transport typeOfTransportPlane){
		this.typeOfTransportPlane=typeOfTransportPlane; 
	}
	
	public String getTypeOfTransporting() {
		return "Transporter : " + typeOfTransportPlane  +  "  number of seats: " + numberOfTransporting;
	}
	
	public void setTypeOfFreight(Freight typeOfFreightPlane) {
		this.typeOfFreightPlane= typeOfFreightPlane;
	}
	
	public  String getTypeOfFreight() {
		return " Freighter : " + typeOfFreightPlane+  " numbers of tons : " + numberOfTransporting ;
	}
	
	public void setNumberOfTransporting(int numberOfTransporting) {
		this.numberOfTransporting = numberOfTransporting ;
	}

	public int getNumberOfTransporting() {
		return numberOfTransporting ;
	}
	
	public void setRangeOfFly(int rangeOfFly) {
		this.rangeOfFly = rangeOfFly;
	}
	
	public int getRangeOfFly() {
		return rangeOfFly;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

}