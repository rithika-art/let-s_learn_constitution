package com.constitution.backend.service;

import com.constitution.backend.entity.Leaderboard;
import com.constitution.backend.repository.LeaderboardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderboardService {

    private final LeaderboardRepository leaderboardRepository;

    public LeaderboardService(LeaderboardRepository leaderboardRepository) {
        this.leaderboardRepository = leaderboardRepository;
    }

    public List<Leaderboard> getLeaderboard() {
        return leaderboardRepository.findAllByOrderByScoreDesc();
    }

    public Leaderboard saveScore(Leaderboard leaderboard) {
        return leaderboardRepository.save(leaderboard);
    }
}