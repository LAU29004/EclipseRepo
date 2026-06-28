package com.example.iplteams;

public class InvalidTeamException extends RuntimeException {

    public InvalidTeamException(String message) {
        super(message);
    }
}