package com.files.ipl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class IplManager {
    private Map<String, Team> teams = new HashMap<>();
    private static final String FILE_PATH = "C:\\Users\\Laukik\\git\\EclipseRepo\\Java-Assignments\\src\\input_ipl"; 

    public void loadTeamsFromFile(String filePath) {
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            lines.map(line -> line.split(","))
                 .filter(parts -> parts.length >= 4) 
                 .forEach(parts -> {
                     String teamName = parts[0].trim();
                     String playerName = parts[1].trim();
                     String role = parts[2].trim();
                     double bid = Double.parseDouble(parts[3].trim());

                     Team team = teams.computeIfAbsent(teamName, Team::new);
                     team.addPlayer(new Player(playerName, role, bid));
                 });
            System.out.println(">>> Data loaded successfully from " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public void addPlayerToTeam(String teamName, String name, String role, double bid) {
        Team team = teams.get(teamName);
        
        String fileLine = String.format("%s,%s,%s,%.1f,NEWLY ADDED\n", teamName, name, role, bid);

        if (team != null) {
            if (team.addPlayer(new Player(name, role, bid))) {
                savePlayerToFile(fileLine);
                System.out.println("Success: Added " + name + " to " + teamName + " and saved to file.");
            }
        } else {
            if (teams.size() < 3) {
                Team newTeam = new Team(teamName);
                newTeam.addPlayer(new Player(name, role, bid));
                teams.put(teamName, newTeam);
                savePlayerToFile(fileLine);
                System.out.println("Success: Created team " + teamName + ", added " + name + " and saved to file.");
            } else {
                System.out.println("Error: Cannot add team. Maximum limit of 3 teams reached.");
            }
        }
    }

    private void savePlayerToFile(String lineContent) {
        try {
            Files.write(
                Paths.get(FILE_PATH), 
                lineContent.getBytes(), 
                StandardOpenOption.CREATE, 
                StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void removePlayerFromTeam(String teamName, String playerName) {
        Team team = teams.get(teamName);
        if (team != null) {
            if (team.removePlayer(playerName)) {
                System.out.println("Success: Removed '" + playerName + "' from " + teamName + " (Memory Updated).");
            } else {
                System.out.println("Error: Player '" + playerName + "' not found in " + teamName);
            }
        } else {
            System.out.println("Error: Team '" + teamName + "' does not exist.");
        }
    }

    public void searchPlayerDetails(String playerName) {
        Optional<String> playerInfo = teams.values().stream()
            .flatMap(team -> team.getPlayers().stream()
                .filter(player -> player.getName().equalsIgnoreCase(playerName))
                .map(player -> "\nFound Player: " + player.getName() + 
                               "\nTeam: " + team.getName() + 
                               "\nRole: " + player.getRole() + 
                               "\nBid: ₹" + player.getBid() + " Cr"))
            .findFirst();

        System.out.println(playerInfo.orElse("\nPlayer '" + playerName + "' not found."));
    }

    public void searchTeamDetails(String teamName) {
        Optional<Team> foundTeam = teams.values().stream()
            .filter(team -> team.getName().equalsIgnoreCase(teamName))
            .findFirst();

        if (foundTeam.isPresent()) {
            foundTeam.get().displayTeam();
        } else {
            System.out.println("\nTeam '" + teamName + "' not found.");
        }
    }

    public void displayAllTeams() {
        if (teams.isEmpty()) {
            System.out.println("No teams available.");
        } else {
            teams.values().forEach(Team::displayTeam);
        }
    }
}