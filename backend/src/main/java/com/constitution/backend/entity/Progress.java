package com.constitution.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "progress")
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private int completedArticles;

    private int completedQuizzes;

    private int totalScore;

    public Progress() {
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public int getCompletedArticles() {
        return completedArticles;
    }

    public int getCompletedQuizzes() {
        return completedQuizzes;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCompletedArticles(int completedArticles) {
        this.completedArticles = completedArticles;
    }

    public void setCompletedQuizzes(int completedQuizzes) {
        this.completedQuizzes = completedQuizzes;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}