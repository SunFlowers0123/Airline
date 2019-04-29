package Plane;

import Enumeration.Transport;

public class TransportPlane extends Plane {
	
	
	public TransportPlane(Transport typeOfTransportPlane , int numberOfTransporting  , int rangeOfFly , int fuelConsumption) {
	
		setTypeOfTransport(typeOfTransportPlane);
		setNumberOfTransporting (numberOfTransporting );
		setRangeOfFly(rangeOfFly);
		setFuelConsumption(fuelConsumption);
//		setLoadCapacity(loadCapacity);
		
	}

	@Override
	public String toString() {
		return  getTypeOfTransporting()+"";
	}
	
	
	
	
}