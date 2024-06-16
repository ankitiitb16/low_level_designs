package com.projects.low_level_designs.parking_lot.models;
import lombok.Data;

import java.util.List;
@Data
public class ParkingLot extends BaseModel{

    private String address;
    private List<ParkingFloor> parkingFloors;

    private List<Gate> gates;

    private List<VehicleTypes> allowedVehicleTypes;

    private ParkingLotStatus parkingLotStatus;

    private SlotAssignmentStrategyType slotAssignmentStrategyType;
}
