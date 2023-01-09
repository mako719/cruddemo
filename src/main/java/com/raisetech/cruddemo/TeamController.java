package com.raisetech.cruddemo;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
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

    @GetMapping("/teams/{id}")
    public Team getTeams(@Validated @PathVariable("id") int id) throws Exception {
        return teamService.findById(id);
    }

    @PostMapping("/teams")
    public ResponseEntity<Map<String, Serializable>> createTeam(@Validated @RequestBody CreateForm form, UriComponentsBuilder uriBuilder) {
        System.out.println(form.getName());
        teamService.createTeam(form);
        int id = form.getId();
        URI url = uriBuilder.path("/name/" + id).
                build().
                toUri();
        return ResponseEntity.created(url).body(Map.of("id", id, "message", "チームが登録されました。"));
    }

    @PatchMapping("/teams/{id}")
    public ResponseEntity<Map<String, String>> updateTeam(@PathVariable int id, @RequestBody UpdateForm form) {
        teamService.updateTeam(id, form);
        return ResponseEntity.ok(Map.of("message", "チームを更新しました。"));
    }

    @DeleteMapping("/teams/{id}")
    public ResponseEntity<Map<String, String>> deleteTeam(@PathVariable int id){
        teamService.deleteTeam(id);
        return ResponseEntity.ok(Map.of("message", "チームを削除しました。"));
    }
}
