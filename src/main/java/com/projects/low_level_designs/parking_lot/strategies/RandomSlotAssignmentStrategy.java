package com.projects.low_level_designs.parking_lot.strategies;

import com.projects.low_level_designs.parking_lot.models.Gate;
import com.projects.low_level_designs.parking_lot.models.ParkingSlot;
import com.projects.low_level_designs.parking_lot.models.VehicleTypes;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy{

    @Override
    public ParkingSlot getSlot(Gate gate, VehicleTypes vehicleTypes) {
        ParkingSlot parkingSlot = new ParkingSlot();
        parkingSlot.setSlotNumber(8);
        return parkingSlot;
    }
}
