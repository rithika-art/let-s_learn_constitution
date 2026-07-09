package com.constitution.backend.service;

import com.constitution.backend.entity.Progress;
import com.constitution.backend.repository.ProgressRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProgressService {

    private final ProgressRepository progressRepository;

    public ProgressService(ProgressRepository progressRepository) {
        this.progressRepository = progressRepository;
    }

    public Optional<Progress> getProgressByUserId(Long userId) {
        return progressRepository.findByUserUserId(userId);
    }

    public Progress saveProgress(Progress progress) {
        return progressRepository.save(progress);
    }

    public Progress updateProgress(Long id, Progress updatedProgress) {

        Progress progress = progressRepository.findById(id).orElseThrow();

        progress.setCompletedArticles(updatedProgress.getCompletedArticles());
        progress.setCompletedQuizzes(updatedProgress.getCompletedQuizzes());
        progress.setTotalScore(updatedProgress.getTotalScore());

        return progressRepository.save(progress);
    }
}