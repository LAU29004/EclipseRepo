package com.files.ipl;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String name;
	private List<Player>players;
	private static final int MAX_PLAYERS = 5;
	
	public Team(String name) {
		this.name = name;
		this.players = new ArrayList<>();
		}

	public String getName() {
		return name;
	}

	public List<Player> getPlayers() {
		return players;
	}
	
	public boolean addPlayer(Player player) {
        if (players.size() >= MAX_PLAYERS) {
            System.out.println("Cannot add " + player.getName() + ". Team " + name + " is full (Max 5 players).");
            return false;
        }
        players.add(player);
        return true;
    }

    public boolean removePlayer(String playerName) {
        return players.removeIf(p -> p.getName().equalsIgnoreCase(playerName));
    }

    public void displayTeam() {
        System.out.println("\n--- " + name + " ---");
        if (players.isEmpty()) {
            System.out.println("No players in this team.");
        } else {
            players.forEach(System.out::println);
        }
    }
}
	
