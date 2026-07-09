package com.constitution.backend.controller;

import com.constitution.backend.entity.Progress;
import com.constitution.backend.service.ProgressService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/progress")
public class ProgressController {

    private final ProgressService progressService;

    public ProgressController(ProgressService progressService) {
        this.progressService = progressService;
    }

    @GetMapping("/user/{userId}")
    public Optional<Progress> getProgressByUser(@PathVariable Long userId) {
        return progressService.getProgressByUserId(userId);
    }

    @PostMapping
    public Progress saveProgress(@RequestBody Progress progress) {
        return progressService.saveProgress(progress);
    }

    @PutMapping("/{id}")
    public Progress updateProgress(@PathVariable Long id,
                                   @RequestBody Progress progress) {
        return progressService.updateProgress(id, progress);
    }
}
