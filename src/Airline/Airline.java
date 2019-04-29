package Airline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import Enumeration.Freight;
import Enumeration.Transport;
import Plane.FreightPlane;
import Plane.Plane;
import Plane.TransportPlane;

public class Airline {
	
	private Random rand = new Random();
	private List<Plane> listOfPlanes = new ArrayList();
	private List<Plane> listOfTransportPlane = new ArrayList(); 
	private List<Plane> listOfFreightPlane = new ArrayList();
	private Transport typeOfTransportPlane ;
	private int numberOfCrew ;
	private int numberOfFreight;
	private int rangeOfFly ;
	private int fuelConsumption ;
	private int whichPlane ;

	//In this method creating state of the object TransportPlane
	private void createAtributesOfTransportPlane() {
		numberOfCrew = 0;
		whichPlane = rand.nextInt(Transport.values().length);
		int numCrew=rand.nextInt(50)+1 , numLoadCapacity;
		
		if(Transport.values()[whichPlane]==Transport.BOEING_747) { numberOfCrew=500 + numCrew ; rangeOfFly=14_200; fuelConsumption = 7000;}// loadCapacity=17000+(numLoadCapacity=rand.nextInt(1000));}
		if(Transport.values()[whichPlane]==Transport.AN_30) 	 { numberOfCrew=200 + numCrew ; rangeOfFly=10_500; fuelConsumption = 2400;}// loadCapacity=16000+(numLoadCapacity=rand.nextInt(1000));}
		if(Transport.values()[whichPlane]==Transport.ANTONOV)	 { numberOfCrew=420 + numCrew ; rangeOfFly=11_800; fuelConsumption = 5100;}// loadCapacity=16000+(numLoadCapacity=rand.nextInt(1000));}
		if(Transport.values()[whichPlane]==Transport.AN_38) 	 { numberOfCrew=300 + numCrew ; rangeOfFly=15_600; fuelConsumption = 3300;}// loadCapacity=17500+(numLoadCapacity=rand.nextInt(1000));}
		if(Transport.values()[whichPlane]==Transport.GALAXY) 	 { numberOfCrew=270 + numCrew ; rangeOfFly=19_100; fuelConsumption = 6400;}// loadCapacity=24000+(numLoadCapacity=rand.nextInt(1000));}
		if(Transport.values()[whichPlane]==Transport.IL_76) 	 { numberOfCrew=150 + numCrew ; rangeOfFly=11_550; fuelConsumption = 5300;}// loadCapacity=24000+(numLoadCapacity=rand.nextInt(1000));} 
	}

	//In this method creating state of the object FreightPlane
	private void createAtributesOfFreightPlane() {
		numberOfFreight = 0;
		whichPlane = rand.nextInt(Freight.values().length);
		int numFreight , numOfFuel;
		
		if(Freight.values()[whichPlane]==Freight.AIRBUS) 	 { numberOfFreight=500_000 + (numFreight=rand.nextInt(50_000)); rangeOfFly=8_200; fuelConsumption = 5500+(numOfFuel=rand.nextInt(400) ) ; }//loadCapacity=17000+(numLoadCapacity=rand.nextInt(1000));}
		if(Freight.values()[whichPlane]==Freight.BOEING_400) { numberOfFreight=149_000 + (numFreight=rand.nextInt(10_000)); rangeOfFly=5_400; fuelConsumption = 6500+(numOfFuel=rand.nextInt(700) ) ; }// loadCapacity=17000+(numLoadCapacity=rand.nextInt(1000));}
		if(Freight.values()[whichPlane]==Freight.BOEING_747) { numberOfFreight=440_000 + (numFreight=rand.nextInt(10_000)); rangeOfFly=7_200; fuelConsumption = 7000+(numOfFuel=rand.nextInt(500) ) ; }//loadCapacity=17000+(numLoadCapacity=rand.nextInt(1000));}
		if(Freight.values()[whichPlane]==Freight.DREAM) 	 { numberOfFreight=500_000 + (numFreight=rand.nextInt(50_000)); rangeOfFly=7_700; fuelConsumption = 8000+(numOfFuel=rand.nextInt(1000)) ; }//loadCapacity=17000+(numLoadCapacity=rand.nextInt(1000));}
		if(Freight.values()[whichPlane]==Freight.YAK_42)	 { numberOfFreight=183_000 + (numFreight=rand.nextInt(10_000)); rangeOfFly=4_900; fuelConsumption = 3700+(numOfFuel=rand.nextInt(300) ) ; }//loadCapacity=17000+(numLoadCapacity=rand.nextInt(1000));}
	}
	
//	public FreightPlane(Freight typeOfFreight , int numberOfCrew , int rangeOfFly , int fuelConsumption , int loadCapacity) {
	private void factoryPlanes() {
		createAtributesOfTransportPlane() ;
		createAtributesOfFreightPlane()   ;
		int choices= rand.nextInt(2);
		if(choices == 1) {
			listOfPlanes.add(new TransportPlane(Transport.values()[whichPlane] , numberOfCrew , rangeOfFly , fuelConsumption)) ;//, loadCapacity));
			listOfTransportPlane.add(new TransportPlane(Transport.values()[whichPlane] , numberOfCrew , rangeOfFly , fuelConsumption));
		}else if(choices == 0) {
			listOfPlanes.add(new FreightPlane(Freight.values()[whichPlane] , numberOfFreight , rangeOfFly , fuelConsumption)); //, loadCapacity));
			listOfFreightPlane.add(new FreightPlane(Freight.values()[whichPlane] , numberOfFreight , rangeOfFly , fuelConsumption));
		}else if (( choices > 1)&&(choices<0)) System.out.println("Fatal");
	}
	
	// here calls method that do a creating transport and freight plane
	private void  createPlanes() {
		int numbersOfPlanes = rand.nextInt(30);
		for(int i = 0; i<numbersOfPlanes;i++) {
			factoryPlanes();
		}
	}
	
	public void showAvailableTransportPlane() {
		createPlanes();
		for(Plane plane : listOfPlanes) {
			System.out.println(plane);
		}
		
	}
	// this method make a count number of seats on transporting plane
	public void calculateGeneralNumberOfSeats() {
		int result=0;
		for(int i=0;i<listOfTransportPlane.size();i++) {
			result = result + numberOfCrew;
		}
		System.out.println("General numbes of seats transporting planes : " + result);
	}
	
	// this method make a count number of seats on freight plane
	public void calculateGeneralNumberOfTons() {
		int result=0;
		for(int i=0;i<listOfFreightPlane.size();i++) {
			result = result + listOfFreightPlane.get(i).getNumberOfTransporting();
		}
		System.out.println("General numbes of transporting tons freight planes : " + result);
	}
	// here we sorting plane by fuel consumption
	private void sortPlaneByConsumptionFuel(List<Plane> list){
        Collections.sort(list, new Comparator<Plane>() {
            @Override
        	public int compare(Plane o1, Plane o2) {
                return Double.compare(o1.getFuelConsumption(), o2.getFuelConsumption());
            }
        });
	}
	// print sorted planes
	public void sortPlane() {
		sortPlaneByConsumptionFuel(listOfPlanes);
		for(int i = 0 ; i<listOfTransportPlane.size();i++) {
			System.out.println( listOfTransportPlane.get(i).getTypeOfTransporting()+ " fuel consumption : " +listOfTransportPlane.get(i).getFuelConsumption());
		}
		for(int i = 0 ; i<listOfFreightPlane.size();i++) {
			System.out.println( listOfFreightPlane.get(i).getTypeOfFreight()+ "  fuel consumption : " +listOfFreightPlane.get(i).getFuelConsumption());
		}
	}
	
	// algorithm for search plame in range
	public void searchPlaneByFuelConsumption(int begin , int end) {
		for(int i = 0 ; i<listOfPlanes.size();i++) {
			if ((listOfPlanes.get(i).getFuelConsumption()>begin)&&(listOfPlanes.get(i).getFuelConsumption()<end)){
				System.out.println(listOfPlanes.get(i));
			}
		}
	
		
	}

	
}


















