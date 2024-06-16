package com.projects.low_level_designs.parking_lot.dto;

import com.projects.low_level_designs.parking_lot.models.Ticket;
import lombok.Data;

@Data
public class IssueTicketResponseDTO {

    private Ticket ticket;

    private ResponseType responseType;

    private String failureMessage;
}
