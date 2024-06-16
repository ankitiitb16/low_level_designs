package com.projects.low_level_designs;

import com.projects.low_level_designs.parking_lot.controller.TicketController;
import com.projects.low_level_designs.parking_lot.dto.IssueTicketRequestDTO;
import com.projects.low_level_designs.parking_lot.dto.IssueTicketResponseDTO;
import com.projects.low_level_designs.parking_lot.models.Gate;
import com.projects.low_level_designs.parking_lot.models.Ticket;
import com.projects.low_level_designs.parking_lot.models.VehicleTypes;
import com.projects.low_level_designs.parking_lot.repositories.GateRepository;
import com.projects.low_level_designs.parking_lot.repositories.ParkingLotRepository;
import com.projects.low_level_designs.parking_lot.repositories.TicketRepository;
import com.projects.low_level_designs.parking_lot.repositories.VehicleRepository;
import com.projects.low_level_designs.parking_lot.service.TicketService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.TreeMap;

@SpringBootApplication
public class LowLevelDesignsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LowLevelDesignsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Map<Long, Gate> gates = new TreeMap<>();
		Gate gate = new Gate();
		gate.setGateNumber(2);
		gates.put(2L, gate);
		GateRepository gateRepository = new GateRepository(gates);
		ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
		VehicleRepository vehicleRepository = new VehicleRepository();
		TicketRepository ticketRepository = new TicketRepository();

		TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository, ticketRepository);

		TicketController ticketController = new TicketController(ticketService);
		IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
		issueTicketRequestDTO.setGateId(2L);
		issueTicketRequestDTO.setVehicleNumber("KA03NT2835");
		issueTicketRequestDTO.setVehicleType(VehicleTypes.CAR);
		issueTicketRequestDTO.setVehicleOwnerName("Ankit Ranjan");
		IssueTicketResponseDTO response = ticketController.issueTicket(issueTicketRequestDTO);
		System.out.println(response);

	}
}
