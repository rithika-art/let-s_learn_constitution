package com.constitution.backend.controller;

import com.constitution.backend.entity.Leaderboard;
import com.constitution.backend.service.LeaderboardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leaderboard")
public class LeaderboardController {

    private final LeaderboardService leaderboardService;

    public LeaderboardController(LeaderboardService leaderboardService) {
        this.leaderboardService = leaderboardService;
    }

    @GetMapping
    public List<Leaderboard> getLeaderboard() {
        return leaderboardService.getLeaderboard();
    }

    @PostMapping
    public Leaderboard addScore(@RequestBody Leaderboard leaderboard) {
        return leaderboardService.saveScore(leaderboard);
    }
}