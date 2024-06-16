package com.projects.low_level_designs.parking_lot.strategies;

import com.projects.low_level_designs.parking_lot.models.Gate;
import com.projects.low_level_designs.parking_lot.models.ParkingSlot;
import com.projects.low_level_designs.parking_lot.models.Vehicle;
import com.projects.low_level_designs.parking_lot.models.VehicleTypes;

public interface SlotAssignmentStrategy {
    public ParkingSlot getSlot(Gate gate, VehicleTypes vehicleTypes);
}
