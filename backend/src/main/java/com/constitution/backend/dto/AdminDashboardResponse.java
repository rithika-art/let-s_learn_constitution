package com.constitution.backend.dto;

public class AdminDashboardResponse {

    private long totalUsers;
    private long totalArticles;
    private long totalQuestions;
    private long totalBookmarks;

    public AdminDashboardResponse() {
    }

    public long getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(long totalUsers) {
        this.totalUsers = totalUsers;
    }

    public long getTotalArticles() {
        return totalArticles;
    }

    public void setTotalArticles(long totalArticles) {
        this.totalArticles = totalArticles;
    }

    public long getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(long totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public long getTotalBookmarks() {
        return totalBookmarks;
    }

    public void setTotalBookmarks(long totalBookmarks) {
        this.totalBookmarks = totalBookmarks;
    }
}