package com.example.assignments;

import java.util.Scanner;

import com.files.ipl.IplManager;

public class FileIPL {
    private static final String FILE_PATH = "C:\\Users\\Laukik\\git\\EclipseRepo\\Java-Assignments\\src\\input_ipl";

	public static void main(String[] args) {
        IplManager manager = new IplManager();
        Scanner scanner = new Scanner(System.in); 

        manager.loadTeamsFromFile(FILE_PATH);

        int choice;
        do {
            System.out.println("\n================ IPL MANAGEMENT MENU ================");
            System.out.println("1. Search Player Details (Role, Bid, Team)");
            System.out.println("2. Search Team Squad");
            System.out.println("3. Add Player to a Team (Saves to File)");
            System.out.println("4. Remove Player from a Team");
            System.out.println("5. View All Teams & Squads");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Player Name to search: ");
                    String pName = scanner.nextLine().trim();
                    manager.searchPlayerDetails(pName);
                    break;

                case 2:
                    System.out.print("Enter Team Name to search: ");
                    String tName = scanner.nextLine().trim();
                    manager.searchTeamDetails(tName);
                    break;

                case 3:
                    System.out.print("Enter Team Name: ");
                    String teamForAdd = scanner.nextLine().trim();
                    System.out.print("Enter Player Name: ");
                    String newPlayerName = scanner.nextLine().trim();
                    System.out.print("Enter Player Role: ");
                    String newPlayerRole = scanner.nextLine().trim();
                    System.out.print("Enter Bid Amount (in Crores): ");
                    while (!scanner.hasNextDouble()) {
                        System.out.print("Please enter a valid numeric value for bid: ");
                        scanner.next();
                    }
                    double newPlayerBid = scanner.nextDouble();
                    scanner.nextLine(); 

                    manager.addPlayerToTeam(teamForAdd, newPlayerName, newPlayerRole, newPlayerBid);
                    break;

                case 4:
                    System.out.print("Enter Team Name from which to remove: ");
                    String teamForRemove = scanner.nextLine().trim();
                    System.out.print("Enter Player Name to remove: ");
                    String playerToRemove = scanner.nextLine().trim();
                    
                    manager.removePlayerFromTeam(teamForRemove, playerToRemove);
                    break;

                case 5:
                    System.out.println("\n--- Complete IPL Roster ---");
                    manager.displayAllTeams();
                    break;

                case 6:
                    System.out.println("Exiting Application.");
                    break;

                default:
                    System.out.println("Invalid option! Select between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
