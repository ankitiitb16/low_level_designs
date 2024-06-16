package com.projects.low_level_designs.parking_lot.models;

import lombok.Data;

@Data
public class Gate extends BaseModel{
    private int gateNumber;

    private Operator currentOperator;

    private GateType gateType;

    private GateStatus gateStatus;
}
