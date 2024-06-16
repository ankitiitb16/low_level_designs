package com.projects.low_level_designs.parking_lot.repositories;

import com.projects.low_level_designs.parking_lot.models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {

    private Map<Long, Gate> gates;

    public GateRepository(Map<Long, Gate> gates){
        this.gates = gates;
    }

    public Optional<Gate> findGateById(Long gateId){
        // db.execute(select * from gates where id)
        if(gates.containsKey(gateId)){
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}

// List
// hashMap<id, Gate>
// TreeMap sorted according to order
