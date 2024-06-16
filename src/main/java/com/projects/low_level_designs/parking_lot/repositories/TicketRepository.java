package com.projects.low_level_designs.parking_lot.repositories;

import com.projects.low_level_designs.parking_lot.models.ParkingLot;
import com.projects.low_level_designs.parking_lot.models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {

    private Map<Long, Ticket> tickets = new TreeMap<>();

    private long previousId = 0;
    public Ticket saveTicket(Ticket ticket){
        previousId +=1;
        ticket.setId(previousId);
        tickets.put(previousId, ticket);
        return ticket;
    }
}
