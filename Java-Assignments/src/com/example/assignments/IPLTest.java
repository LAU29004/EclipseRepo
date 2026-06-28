package com.example.assignments;

import java.util.*;
import com.example.iplteams.Player;
import com.example.iplteams.InvalidTeamException;

public class IPLTest {

    private static final Set<String> VALID_TEAMS = Set.of(
            "RCB", "MI", "CSK", "KKR", "SRH",
            "GT", "LSG", "RR", "DC", "PBKS"
    );

    public static void main(String[] args) {

        HashMap<String, Player> playerMap = new HashMap<>();
        HashMap<String, ArrayList<Player>> teamMap = new HashMap<>();

        // ==========================================
        // 1. ROYAL CHALLENGERS BENGALURU (RCB)
        // ==========================================
        addPlayer(playerMap, teamMap, "Virat Kohli", "RCB", 21.0);
        addPlayer(playerMap, teamMap, "Rajat Patidar", "RCB", 11.0);
        addPlayer(playerMap, teamMap, "Yash Dayal", "RCB", 5.0);
        addPlayer(playerMap, teamMap, "Phil Salt", "RCB", 11.5);
        addPlayer(playerMap, teamMap, "Liam Livingstone", "RCB", 8.75);
        addPlayer(playerMap, teamMap, "Jofra Archer", "RCB", 12.5);
        addPlayer(playerMap, teamMap, "Josh Hazlewood", "RCB", 12.5);
        addPlayer(playerMap, teamMap, "Krunal Pandya", "RCB", 5.75);
        addPlayer(playerMap, teamMap, "Bhuvneshwar Kumar", "RCB", 10.75);
        addPlayer(playerMap, teamMap, "Rasikh Salam", "RCB", 6.0);

        // ==========================================
        // 2. MUMBAI INDIANS (MI)
        // ==========================================
        addPlayer(playerMap, teamMap, "Jasprit Bumrah", "MI", 18.0);
        addPlayer(playerMap, teamMap, "Suryakumar Yadav", "MI", 16.35);
        addPlayer(playerMap, teamMap, "Hardik Pandya", "MI", 16.35);
        addPlayer(playerMap, teamMap, "Rohit Sharma", "MI", 16.30);
        addPlayer(playerMap, teamMap, "Tilak Varma", "MI", 8.0);
        addPlayer(playerMap, teamMap, "Trent Boult", "MI", 12.5);
        addPlayer(playerMap, teamMap, "Ryan Rickelton", "MI", 1.0);
        addPlayer(playerMap, teamMap, "Deepak Chahar", "MI", 9.25);
        addPlayer(playerMap, teamMap, "Allah Ghazanfar", "MI", 4.8);
        addPlayer(playerMap, teamMap, "Ashutosh Sharma", "MI", 3.8);

        // ==========================================
        // 3. CHENNAI SUPER KINGS (CSK)
        // ==========================================
        addPlayer(playerMap, teamMap, "Ruturaj Gaikwad", "CSK", 18.0);
        addPlayer(playerMap, teamMap, "Matheesha Pathirana", "CSK", 13.0);
        addPlayer(playerMap, teamMap, "Shivam Dube", "CSK", 12.0);
        addPlayer(playerMap, teamMap, "Ravindra Jadeja", "CSK", 18.0);
        addPlayer(playerMap, teamMap, "MS Dhoni", "CSK", 4.0);
        addPlayer(playerMap, teamMap, "Ravichandran Ashwin", "CSK", 9.75);
        addPlayer(playerMap, teamMap, "Rachin Ravindra", "CSK", 4.0);
        addPlayer(playerMap, teamMap, "Khaleel Ahmed", "CSK", 4.8);
        addPlayer(playerMap, teamMap, "Devon Conway", "CSK", 6.25);
        addPlayer(playerMap, teamMap, "Rahul Tripathi", "CSK", 3.4);

        // ==========================================
        // 4. KOLKATA KNIGHT RIDERS (KKR)
        // ==========================================
        addPlayer(playerMap, teamMap, "Rinku Singh", "KKR", 13.0);
        addPlayer(playerMap, teamMap, "Varun Chakaravarthy", "KKR", 12.0);
        addPlayer(playerMap, teamMap, "Sunil Narine", "KKR", 12.0);
        addPlayer(playerMap, teamMap, "Andre Russell", "KKR", 12.0);
        addPlayer(playerMap, teamMap, "Harshit Rana", "KKR", 4.0);
        addPlayer(playerMap, teamMap, "Ramandeep Singh", "KKR", 4.0);
        addPlayer(playerMap, teamMap, "Quinton de Kock", "KKR", 3.6);
        addPlayer(playerMap, teamMap, "Venkatesh Iyer", "KKR", 5.5);
        addPlayer(playerMap, teamMap, "Anrich Nortje", "KKR", 6.5);
        addPlayer(playerMap, teamMap, "Vaibhav Arora", "KKR", 1.8);

        // ==========================================
        // 5. SUNRISERS HYDERABAD (SRH)
        // ==========================================
        addPlayer(playerMap, teamMap, "Heinrich Klaasen", "SRH", 23.0);
        addPlayer(playerMap, teamMap, "Pat Cummins", "SRH", 18.0);
        addPlayer(playerMap, teamMap, "Abhishek Sharma", "SRH", 14.0);
        addPlayer(playerMap, teamMap, "Travis Head", "SRH", 14.0);
        addPlayer(playerMap, teamMap, "Nitish Kumar Reddy", "SRH", 6.0);
        addPlayer(playerMap, teamMap, "Ishan Kishan", "SRH", 11.25);
        addPlayer(playerMap, teamMap, "Mohammed Shami", "SRH", 10.0);
        addPlayer(playerMap, teamMap, "Adam Zampa", "SRH", 2.4);
        addPlayer(playerMap, teamMap, "Harpreet Brar", "SRH", 1.5);
        addPlayer(playerMap, teamMap, "Jaydev Unadkat", "SRH", 1.0);

        // ==========================================
        // 6. GUJARAT TITANS (GT)
        // ==========================================
        addPlayer(playerMap, teamMap, "Rashid Khan", "GT", 18.0);
        addPlayer(playerMap, teamMap, "Shubman Gill", "GT", 16.5);
        addPlayer(playerMap, teamMap, "Sai Sudharsan", "GT", 8.5);
        addPlayer(playerMap, teamMap, "Rahul Tewatia", "GT", 4.0);
        addPlayer(playerMap, teamMap, "Shahrukh Khan", "GT", 4.0);
        addPlayer(playerMap, teamMap, "Jos Buttler", "GT", 15.75);
        addPlayer(playerMap, teamMap, "Mohammed Siraj", "GT", 12.25);
        addPlayer(playerMap, teamMap, "Kagiso Rabada", "GT", 10.75);
        addPlayer(playerMap, teamMap, "Prasidh Krishna", "GT", 9.5);
        addPlayer(playerMap, teamMap, "Nishant Sindhu", "GT", 0.3);

        // ==========================================
        // 7. LUCKNOW SUPER GIANTS (LSG)
        // ==========================================
        addPlayer(playerMap, teamMap, "Nicholas Pooran", "LSG", 21.0);
        addPlayer(playerMap, teamMap, "Ravi Bishnoi", "LSG", 11.0);
        addPlayer(playerMap, teamMap, "Mayank Yadav", "LSG", 11.0);
        addPlayer(playerMap, teamMap, "Mohsin Khan", "LSG", 4.0);
        addPlayer(playerMap, teamMap, "Ayush Badoni", "LSG", 4.0);
        addPlayer(playerMap, teamMap, "Rishabh Pant", "LSG", 27.0);
        addPlayer(playerMap, teamMap, "Aiden Markram", "LSG", 2.0);
        addPlayer(playerMap, teamMap, "Mitchell Marsh", "LSG", 3.4);
        addPlayer(playerMap, teamMap, "Avesh Khan", "LSG", 9.75);
        addPlayer(playerMap, teamMap, "Abdul Samad", "LSG", 4.2);

        // ==========================================
        // 8. RAJASTHAN ROYALS (RR)
        // ==========================================
        addPlayer(playerMap, teamMap, "Sanju Samson", "RR", 18.0);
        addPlayer(playerMap, teamMap, "Yashasvi Jaiswal", "RR", 18.0);
        addPlayer(playerMap, teamMap, "Riyan Parag", "RR", 14.0);
        addPlayer(playerMap, teamMap, "Dhruv Jurel", "RR", 14.0);
        addPlayer(playerMap, teamMap, "Shimron Hetmyer", "RR", 5.0);
        addPlayer(playerMap, teamMap, "Sandeep Sharma", "RR", 4.0);
        addPlayer(playerMap, teamMap, "Jofra Archer", "RR", 12.5);
        addPlayer(playerMap, teamMap, "Wanindu Hasaranga", "RR", 5.25);
        addPlayer(playerMap, teamMap, "Maheesh Theekshana", "RR", 4.4);
        addPlayer(playerMap, teamMap, "Vaibhav Suryavanshi", "RR", 1.1);

        // ==========================================
        // 9. DELHI CAPITALS (DC)
        // ==========================================
        addPlayer(playerMap, teamMap, "Axar Patel", "DC", 16.5);
        addPlayer(playerMap, teamMap, "Kuldeep Yadav", "DC", 13.25);
        addPlayer(playerMap, teamMap, "Tristan Stubbs", "DC", 10.0);
        addPlayer(playerMap, teamMap, "Abishek Porel", "DC", 4.0);
        addPlayer(playerMap, teamMap, "KL Rahul", "DC", 14.0);
        addPlayer(playerMap, teamMap, "Mitchell Starc", "DC", 11.75);
        addPlayer(playerMap, teamMap, "T. Natarajan", "DC", 10.75);
        addPlayer(playerMap, teamMap, "Jake Fraser-McGurk", "DC", 9.0);
        addPlayer(playerMap, teamMap, "Harry Brook", "DC", 4.0);
        addPlayer(playerMap, teamMap, "Sameer Rizvi", "DC", 0.9);

        // ==========================================
        // 10. PUNJAB KINGS (PBKS)
        // ==========================================
        addPlayer(playerMap, teamMap, "Shashank Singh", "PBKS", 5.5);
        addPlayer(playerMap, teamMap, "Prabhsimran Singh", "PBKS", 4.0);
        addPlayer(playerMap, teamMap, "Shreyas Iyer", "PBKS", 26.75);
        addPlayer(playerMap, teamMap, "Arshdeep Singh", "PBKS", 18.0);
        addPlayer(playerMap, teamMap, "Yuzvendra Chahal", "PBKS", 18.0);
        addPlayer(playerMap, teamMap, "Marcus Stoinis", "PBKS", 11.0);
        addPlayer(playerMap, teamMap, "Glenn Maxwell", "PBKS", 4.2);
        addPlayer(playerMap, teamMap, "Nehal Wadhera", "PBKS", 4.2);
        addPlayer(playerMap, teamMap, "Harpreet Singh", "PBKS", 0.3);
        addPlayer(playerMap, teamMap, "Vishnu Vinod", "PBKS", 0.3);

        // ==========================================
        // MENU
        // ==========================================
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\n===== IPL SEARCH SYSTEM =====");
            System.out.println("1. Search Player");
            System.out.println("2. Search Team");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Player Name: ");
                    String playerName = sc.nextLine().trim();

                    if (playerMap.containsKey(playerName)) {
                        Player p = playerMap.get(playerName);
                        System.out.println("\nPlayer Details");
                        System.out.println("-----------------------");
                        System.out.println("Name : " + p.name);
                        System.out.println("Team : " + p.team);
                        System.out.println("Bid  : ₹" + p.bid + " Crore");
                    } else {
                        System.out.println("Player Not Found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Team Name: ");
                    String team = sc.nextLine().trim().toUpperCase();

                    if (!VALID_TEAMS.contains(team)) {
                        System.out.println("\nCustom Exception Triggered!");
                        System.out.println(
                            new InvalidTeamException(
                                "Error: '" + team + "' is not a valid IPL Team!"
                            ).getMessage()
                        );
                    } else {
                        System.out.println("\nPlayers in " + team);
                        System.out.println("-----------------------");
                        for (Player p : teamMap.get(team)) {
                            System.out.println(p.name + " - ₹" + p.bid + " Crore");
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } 
    }

    public static void addPlayer(
            HashMap<String, Player> playerMap,
            HashMap<String, ArrayList<Player>> teamMap,
            String name,
            String team,
            double bid) {

        Player player = new Player(name, team, bid);
        playerMap.put(name, player);
        teamMap.putIfAbsent(team, new ArrayList<>());
        teamMap.get(team).add(player);
    }
}