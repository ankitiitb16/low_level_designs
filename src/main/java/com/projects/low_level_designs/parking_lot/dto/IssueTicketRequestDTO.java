package com.projects.low_level_designs.parking_lot.dto;

import com.projects.low_level_designs.parking_lot.models.VehicleTypes;
import lombok.Data;

@Data
public class IssueTicketRequestDTO {

    private String vehicleNumber;

    private String vehicleOwnerName;

    private VehicleTypes vehicleType;

    private Long gateId;
}
