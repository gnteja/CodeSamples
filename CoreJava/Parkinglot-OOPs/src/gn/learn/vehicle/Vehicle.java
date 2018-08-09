package gn.learn.vehicle;

import java.util.ArrayList;

import gn.learn.parking.ParkingSpot;

public abstract class Vehicle {
	
	protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
	protected String LicensePlate;
	protected int spotsNeeded;
	protected VehicleSize size;
	
	public int getSpotsNeeded() {
		return spotsNeeded;
	}
	public VehicleSize getSize() {
		return size;
	}
	//park vehicle in this spot 
	public void parkingSpot(ParkingSpot s) {
		parkingSpots.add(s);
	}
	// remove vehicle from the spot and notify its gone 
	public void clearSpot() {
	}
	//check whether the sot is big enough for the vehicle 
	public abstract boolean canFitinSpot(ParkingSpot spot);
}
