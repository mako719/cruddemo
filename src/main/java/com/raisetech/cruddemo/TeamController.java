package com.raisetech.cruddemo;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/teams")
    public List<TeamResponce> getTeams() {
        return teamService.findAll().stream().map(NameResponse::new).toList();
    }
}
