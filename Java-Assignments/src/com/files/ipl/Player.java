package com.files.ipl;

public class Player {
	private String name;
	private String role;
	private double bid;
	
	public Player(String name, String role, double bid) {
		this.name = name;
		this.role = role;
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public double getBid() {
		return bid;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", role=" + role + ", bid=" + bid + "]";
	}

	
	
}
