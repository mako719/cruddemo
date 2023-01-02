package com.raisetech.cruddemo;

public class Team {
    private int id;

    private String team;

    private String league;

    private int foundingYear;

    public Team(int id, String team, String league, int foundingYear) {
        this.id = id;
        this.team = team;
        this.league = league;
        this.foundingYear = foundingYear;
    }

    public int getId() {
        return id;
    }

    public String getTeam() {
        return team;
    }

    public String getLeague() {
        return league;
    }

    public int getFoundingYear() {
        return foundingYear;
    }
}
