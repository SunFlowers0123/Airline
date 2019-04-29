package Runner;

import java.util.Scanner;

import Airline.Airline;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int beginRange=0; int endRange =0;
		Airline airline = new Airline();
		
		System.out.println("\tAirline");
		System.out.println("Our available planes : ");
		
		airline.showAvailableTransportPlane();
		System.out.println();
		airline.calculateGeneralNumberOfSeats();
		airline.calculateGeneralNumberOfTons();
		System.out.println();
		System.out.println("Sorted plane by consumtion fuel on one hour of fly : ");
			airline.sortPlane();
		
		System.out.println();
		System.out.println("You can find the plane in fuel consumtion .");
		System.out.print("Print range fuel  ");
		System.out.print("\tFrom : "); beginRange=scan.nextInt();
		System.out.print("\tTo:"); endRange=scan.nextInt();
		
		airline.searchPlaneByFuelConsumption(beginRange, endRange);
		
		
	}

}
