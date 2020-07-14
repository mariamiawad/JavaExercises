package com.flight.model;

import java.time.LocalDate;

public class FlightInfo {
	
	private String flightNo;
	private String source;
	private String destination;
	private int totalSeats;
	private int reservedSeats;
	private LocalDate departure;
	private LocalDate arrival;
	
	public FlightInfo(String flightNo, String source, String destination, int totalSeats, int reservedSeats, LocalDate departure,
			LocalDate arrival) {
		super();
		this.flightNo = flightNo;
		this.source = source;
		this.destination = destination;
		this.totalSeats = totalSeats;
		this.reservedSeats = reservedSeats;
		this.departure = departure;
		this.arrival = arrival;
	}
	
	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getReservedSeats() {
		return reservedSeats;
	}
	public void setReservedSeats(int reservedSeats) {
		this.reservedSeats = reservedSeats;
	}
	public LocalDate getDeparture() {
		return departure;
	}
	public void setDeparture(LocalDate departure) {
		this.departure = departure;
	}
	public LocalDate getArrival() {
		return arrival;
	}
	public void setArrival(LocalDate arrival) {
		this.arrival = arrival;
	}

	@Override
	public String toString() {
		return "FlightInfo [flightNo=" + flightNo + ", source=" + source + ", destination=" + destination
				+ ", totalSeats=" + totalSeats + ", reservedSeats=" + reservedSeats + ", departure=" + departure
				+ ", arrival=" + arrival + "]";
	}
	
}
