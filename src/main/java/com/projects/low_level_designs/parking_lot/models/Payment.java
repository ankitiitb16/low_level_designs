package com.projects.low_level_designs.parking_lot.models;

import lombok.Data;

@Data
public class Payment extends BaseModel{

    private int amount;

    private PaymentMode paymentMode;

    private PaymentStatus paymentStatus;

    private Bill bill;

    private String refId;

}
