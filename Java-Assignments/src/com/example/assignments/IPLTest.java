package com.example.assignments;

import com.example.iplteams.Player;
import com.example.iplteams.Team;
import com.example.iplteams.TeamException;
import java.util.ArrayList;
import java.util.Scanner;

public class IPLTest {

    static Scanner scanner = new Scanner(System.in);

    static Team csk = new Team(1, "CSK");
    static Team rcb = new Team(2, "RCB");
    static Team kkr = new Team(3, "KKR");

    public static void main(String[] args) {

        loadDefaultPlayers();

        int choice = 0;
        do {
            printMainMenu();
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    addPlayerMenu();
                    break;
                case 2:
                    removePlayerMenu();
                    break;
                case 3:
                    displayPlayersMenu();
                    break;
                case 4:
                    searchPlayerMenu();
                    break;
                case 5:
                    transferPlayerMenu();
                    break;
                case 6:
                    System.out.println("\nExiting IPL Team Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 6.");
            }

        } while (choice != 6);

        scanner.close();
    }

    static void loadDefaultPlayers() {
        try {
            csk.addPlayer(new Player(101, "MS Dhoni", "Wicket Keeper", 12.0));
            csk.addPlayer(new Player(102, "Ruturaj Gaikwad", "Batsman", 18.0));
            csk.addPlayer(new Player(103, "Ravindra Jadeja", "All Rounder", 16.0));

            rcb.addPlayer(new Player(201, "Virat Kohli", "Batsman", 21.0));
            rcb.addPlayer(new Player(202, "Phil Salt", "Wicket Keeper", 11.5));
            rcb.addPlayer(new Player(203, "Josh Hazlewood", "Bowler", 12.5));

            kkr.addPlayer(new Player(301, "Ajinkya Rahane", "Batsman", 14.0));
            kkr.addPlayer(new Player(302, "Sunil Narine", "All Rounder", 12.0));
            kkr.addPlayer(new Player(303, "Varun Chakravarthy", "Bowler", 12.0));

            System.out.println("==============================================");
            System.out.println("  Welcome to IPL Team Management System!");
            System.out.println("  Default players loaded successfully.");
            System.out.println("==============================================");

        } catch (TeamException e) {
            System.out.println("Error loading default players: " + e.getMessage());
        }
    }

    static void printMainMenu() {
        System.out.println("\n============= MAIN MENU =============");
        System.out.println("  1. Add Player");
        System.out.println("  2. Remove Player");
        System.out.println("  3. Display Players");
        System.out.println("  4. Search Player");
        System.out.println("  5. Transfer Player");
        System.out.println("  6. Exit");
        System.out.println("=====================================");
    }

    static Team selectTeam() {
        System.out.println("Select Team:");
        System.out.println("  1. CSK");
        System.out.println("  2. RCB");
        System.out.println("  3. KKR");
        System.out.print("Enter choice (1/2/3): ");
        String input = scanner.nextLine().trim();
        switch (input) {
            case "1": return csk;
            case "2": return rcb;
            case "3": return kkr;
            default:
                System.out.println("Invalid team selection.");
                return null;
        }
    }

    static void addPlayerMenu() {
        System.out.println("\n--- ADD PLAYER ---");
        Team team = selectTeam();
        if (team == null) return;

        try {
            System.out.print("Enter Player ID: ");
            int id = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Enter Player Name: ");
            String name = scanner.nextLine().trim();

            System.out.print("Enter Player Role (Batsman / Bowler / All Rounder / Wicket Keeper): ");
            String role = scanner.nextLine().trim();

            System.out.print("Enter Bid Amount (in Cr): ");
            double bid = Double.parseDouble(scanner.nextLine().trim());

            Player newPlayer = new Player(id, name, role, bid);
            team.addPlayer(newPlayer);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. ID and Bid must be numbers.");
        } catch (TeamException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void removePlayerMenu() {
        System.out.println("\n--- REMOVE PLAYER ---");
        Team team = selectTeam();
        if (team == null) return;

        System.out.print("Enter Player Name to remove: ");
        String name = scanner.nextLine().trim();
        team.removePlayer(name);
    }

    static void displayPlayersMenu() {
        System.out.println("\n--- DISPLAY PLAYERS ---");
        Team team = selectTeam();
        if (team == null) return;
        team.displayPlayers();
    }

    static void searchPlayerMenu() {
        System.out.println("\n--- SEARCH PLAYER ---");
        System.out.println("Search by:");
        System.out.println("  1. Player ID");
        System.out.println("  2. Player Name");
        System.out.println("  3. Player Role");
        System.out.print("Enter choice (1/2/3): ");
        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                searchById();
                break;
            case "2":
                searchByName();
                break;
            case "3":
                searchByRole();
                break;
            default:
                System.out.println("Invalid search option.");
        }
    }

    static void searchById() {
        System.out.print("Enter Player ID to search: ");
        try {
            int id = Integer.parseInt(scanner.nextLine().trim());
            boolean found = false;

            Team[] teams = {csk, rcb, kkr};
            for (Team t : teams) {
                Player p = t.searchPlayer(id);
                if (p != null) {
                    System.out.println("\nPlayer found in team: " + t.getTeamName());
                    System.out.println(p);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No player found with ID: " + id);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID. Please enter a number.");
        }
    }

    static void searchByName() {
        System.out.print("Enter Player Name to search: ");
        String name = scanner.nextLine().trim();
        boolean found = false;

        Team[] teams = {csk, rcb, kkr};
        for (Team t : teams) {
            Player p = t.searchPlayerByName(name);
            if (p != null) {
                System.out.println("\nPlayer found in team: " + t.getTeamName());
                System.out.println(p);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No player found with name: " + name);
        }
    }

    static void searchByRole() {
        System.out.print("Enter Role to search (Batsman / Bowler / All Rounder / Wicket Keeper): ");
        String role = scanner.nextLine().trim();
        boolean found = false;

        Team[] teams = {csk, rcb, kkr};
        for (Team t : teams) {
            ArrayList<Player> result = t.searchPlayerByRole(role);
            if (!result.isEmpty()) {
                System.out.println("\nPlayers with role '" + role + "' in team " + t.getTeamName() + ":");
                for (Player p : result) {
                    System.out.println("  " + p);
                }
                found = true;
            }
        }
        if (!found) {
            System.out.println("No player found with role: " + role);
        }
    }

    static void transferPlayerMenu() {
        System.out.println("\n--- TRANSFER PLAYER ---");

        System.out.print("Enter Player Name to transfer: ");
        String playerName = scanner.nextLine().trim();

        Team sourceTeam = null;
        Player transferPlayer = null;

        Team[] teams = {csk, rcb, kkr};
        for (Team t : teams) {
            Player p = t.searchPlayerByName(playerName);
            if (p != null) {
                sourceTeam = t;
                transferPlayer = p;
                break;
            }
        }

        if (sourceTeam == null || transferPlayer == null) {
            System.out.println("Player '" + playerName + "' not found in any team.");
            return;
        }

        System.out.println("Player '" + playerName + "' is currently in team: " + sourceTeam.getTeamName());

        System.out.println("Select DESTINATION Team:");
        Team destTeam = selectTeam();
        if (destTeam == null) return;

        if (destTeam.getTeamName().equalsIgnoreCase(sourceTeam.getTeamName())) {
            System.out.println("Player is already in " + destTeam.getTeamName() + ". Cannot transfer to the same team.");
            return;
        }

        try {
            destTeam.addPlayer(transferPlayer);
            sourceTeam.removePlayer(playerName);
            System.out.println("Player '" + playerName + "' successfully transferred from "
                    + sourceTeam.getTeamName() + " to " + destTeam.getTeamName() + ".");
        } catch (TeamException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }
}