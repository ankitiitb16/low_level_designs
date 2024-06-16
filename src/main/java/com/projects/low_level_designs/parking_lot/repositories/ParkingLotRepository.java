package com.projects.low_level_designs.parking_lot.repositories;

import com.projects.low_level_designs.parking_lot.models.Gate;
import com.projects.low_level_designs.parking_lot.models.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {

    private Map<Long, ParkingLot> parkingLots = new TreeMap<>();

    public ParkingLot getParkingLotByGate(Gate gate){
        for (ParkingLot parkingLot: parkingLots.values()){
            if(parkingLot.getGates().contains(gate)){
                return parkingLot;
            }
        }
        return null;
    }
}
