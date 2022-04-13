package com.Flight.springwebflight;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long flightID;
	@Column
	private String fname;
	@Column
	private String source;
	@Column
	private String dest;
	@Column
	private String depTime;
	@Column
	private String arrTime;
	@Column
	private int seats;
	@Column
	private int cost;
	
	
	public Flight(String fname, String source, String dest, String depTime, String arrTime, int seats,
			int cost) {
		super();
		this.fname = fname;
		this.source = source;
		this.dest = dest;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.seats = seats;
		this.cost = cost;
	}

	public Long getFlightID() {
		return flightID;
	}
	public void setFlightID(Long flightID) {
		this.flightID = flightID;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
