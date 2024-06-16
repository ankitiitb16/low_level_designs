package com.projects.low_level_designs.parking_lot.controller;

import com.projects.low_level_designs.parking_lot.dto.IssueTicketRequestDTO;
import com.projects.low_level_designs.parking_lot.dto.IssueTicketResponseDTO;
import com.projects.low_level_designs.parking_lot.dto.ResponseType;
import com.projects.low_level_designs.parking_lot.models.Ticket;
import com.projects.low_level_designs.parking_lot.service.TicketService;


public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDto){
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();

        try {
            Ticket ticket = ticketService.issueTicket(requestDto.getVehicleNumber(),
                    requestDto.getVehicleOwnerName(),
                    requestDto.getVehicleType(),
                    requestDto.getGateId());
            response.setTicket(ticket);
            response.setResponseType(ResponseType.SUCCESS);
        } catch (Exception e){
            response.setResponseType(ResponseType.FAILURE);
            response.setFailureMessage(e.getMessage());
        }

        return response;
    }
}
// Needs to interact with client
// Validations on the input
// Call the service and provide it with inputs
// Receive output from service and send it over to client in proper format