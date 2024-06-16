package com.projects.low_level_designs.parking_lot.repositories;

import com.projects.low_level_designs.parking_lot.models.Vehicle;

import java.util.Optional;

public class VehicleRepository {

    public Optional<Vehicle> getVehicleByNumber(String vehicleNumber){
        return Optional.empty();
    }

    public Vehicle saveVehicle(Vehicle vehicle){
        return vehicle;
    }
}
