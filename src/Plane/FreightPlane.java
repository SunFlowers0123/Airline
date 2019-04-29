package Plane;

import Enumeration.Freight;

public class FreightPlane extends Plane{
	
	public FreightPlane(Freight typeOfFreight , int numberOfTransporting  , int rangeOfFly , int fuelConsumption ) {
		
		setTypeOfFreight(typeOfFreight);
		setNumberOfTransporting (numberOfTransporting );
		setRangeOfFly(rangeOfFly);
		setFuelConsumption(fuelConsumption);
//		setLoadCapacity(loadCapacity);
		
	}

	
	@Override
	public String toString() {
		return getTypeOfFreight()+"";
	}
	
}
