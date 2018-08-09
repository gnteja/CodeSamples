package gn.learn.vehicle;

import gn.learn.parking.ParkingSpot;

public class Bus extends Vehicle {
	
	public Bus(){
		spotsNeeded = 5;
		size = VehicleSize.Large;
	}

	@Override
	public boolean canFitinSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}

}
