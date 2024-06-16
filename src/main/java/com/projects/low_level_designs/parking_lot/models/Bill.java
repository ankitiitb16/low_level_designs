package com.projects.low_level_designs.parking_lot.models;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Bill extends BaseModel{
    private Date exitTime;

    private Ticket ticket;

    private Gate generateAt;

    private Operator generatedBy;

    private int amount;

    private BillStatus billStatus;

    private List<Payment> paymentList;

}
