package com.raisetech.cruddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/teams")
public class TeamController {
    private final TeamService teamService;
    private final AtomicLong counter = new AtomicLong();

    @Autowired
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

    @PostMapping("/create")
    public ResponseEntity<Map<Integer, String>> createTeam(@Validated @RequestBody CreateForm form){
        int id = (int) counter.incrementAndGet();
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/name/" + id)
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of(id, "チームが登録されました。"));
    }
}
