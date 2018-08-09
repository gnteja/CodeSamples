package gn.learn.vehicle;

import gn.learn.parking.ParkingSpot;

public class Car extends Vehicle {
	
	public Car(){
		spotsNeeded = 1;
		size = VehicleSize.Compact;
	}

	@Override
	public boolean canFitinSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}

}
