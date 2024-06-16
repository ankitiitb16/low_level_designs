package com.projects.low_level_designs.parking_lot.models;

import lombok.Data;

@Data
public class Vehicle extends BaseModel{

    private String vehicleNumber;

    private String ownerName;

    private VehicleTypes vehicleTypes;
}
