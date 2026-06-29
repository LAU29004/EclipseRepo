package com.example.iplteams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Team {

    private int teamId;
    private String teamName;
    private HashMap<Integer, Player> players;

    public Team(int teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.players = new HashMap<>();
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void addPlayer(Player player) throws TeamException {
        if (players.containsKey(player.getId())) {
            throw new TeamException("Player with ID " + player.getId() + " already exists in team " + teamName + ".");
        }
        players.put(player.getId(), player);
        System.out.println("Player '" + player.getName() + "' added to " + teamName + " successfully.");
    }

    public void removePlayer(String name) {
        Integer keyToRemove = null;

        for (Map.Entry<Integer, Player> entry : players.entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase(name)) {
                keyToRemove = entry.getKey();
                break;
            }
        }

        if (keyToRemove != null) {
            players.remove(keyToRemove);
            System.out.println("Player '" + name + "' removed from " + teamName + " successfully.");
        } else {
            System.out.println("Player '" + name + "' not found in " + teamName + ".");
        }
    }

    public void displayPlayers() {
        if (players.isEmpty()) {
            System.out.println(teamName + " has no players.");
            return;
        }

        System.out.println("\nPlayers in " + teamName + ":");
        for (Player p : players.values()) {
            System.out.println("  " + p);
        }
    }

    public Player searchPlayer(int id) {
        return players.get(id);
    }

    public Player searchPlayerByName(String name) {
        for (Player p : players.values()) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Player> searchPlayerByRole(String role) {
        ArrayList<Player> result = new ArrayList<>();
        for (Player p : players.values()) {
            if (p.getRole().equalsIgnoreCase(role)) {
                result.add(p);
            }
        }
        return result;
    }
}