package com.raisetech.cruddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.Serializable;
import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class TeamController {
    @Autowired
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<Team> getTames() {
        return teamService.findAll();
    }

    @GetMapping("/{id}")
    public Team getTeams(@Validated @PathVariable("id") int id) throws Exception {
        return teamService.findById(id);
    }

    @PostMapping("/teams")
    public ResponseEntity<Map<String, Serializable>> createTeam(@Validated @RequestBody CreateForm form, UriComponentsBuilder uriBuilder) {
        teamService.createTeam(form);
        int id = form.getId();
        URI url = uriBuilder.path("/name/" + id).
                build().
                toUri();
        return ResponseEntity.created(url).body(Map.of("id", id, "message", "チームが登録されました。"));
    }
}
