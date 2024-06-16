package com.projects.low_level_designs.parking_lot.models;

import lombok.Data;

import java.util.Date;

@Data
public class Ticket extends BaseModel{
    private String number;

    private Date entryTime;

    private Vehicle vehicle;

    private ParkingSlot parkingSlot;

    private Gate generatedAt;

    private Operator generateBy;
}
