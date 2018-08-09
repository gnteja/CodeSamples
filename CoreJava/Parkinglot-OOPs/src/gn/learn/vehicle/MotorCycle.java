package gn.learn.vehicle;

import gn.learn.parking.ParkingSpot;

public class MotorCycle extends Vehicle {
	
	public MotorCycle(){
		spotsNeeded = 1;
		size = VehicleSize.Mototcycle;
	}

	@Override
	public boolean canFitinSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}

}
