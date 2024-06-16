package com.projects.low_level_designs.parking_lot.models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private List<ParkingSlot> parkingSlotsList;
    private List<VehicleTypes> allowedVehicleTypes;

    private ParkingFloorStatus parkingFloorStatus;



}
