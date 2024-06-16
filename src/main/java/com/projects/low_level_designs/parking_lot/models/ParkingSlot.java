package com.projects.low_level_designs.parking_lot.models;

import lombok.Data;

@Data
public class ParkingSlot extends BaseModel{

    private int slotNumber;

    private ParkingSlotStatus parkingSlotStatus;

    private VehicleTypes vehicleTypes;

    private ParkingFloor parkingFloor;
}
