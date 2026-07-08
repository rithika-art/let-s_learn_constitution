package com.constitution.backend.controller;
import com.constitution.backend.entity.User;
import com.constitution.backend.service.UserService;

import java.util.List;
import com.constitution.backend.dto.AdminDashboardResponse;
import com.constitution.backend.entity.Article;
import com.constitution.backend.entity.Question;
import com.constitution.backend.service.AdminService;
import com.constitution.backend.service.ArticleService;
import com.constitution.backend.service.QuestionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final UserService userService;
    private final ArticleService articleService;
    private final QuestionService questionService;
    private final AdminService adminService;

    public AdminController(ArticleService articleService,
                       QuestionService questionService,
                       AdminService adminService,
                       UserService userService) {

    this.articleService = articleService;
    this.questionService = questionService;
    this.adminService = adminService;
    this.userService = userService;
}

    // ================= DASHBOARD =================

    @GetMapping("/dashboard")
    public AdminDashboardResponse getDashboard() {
        return adminService.getDashboard();
    }

    // ================= ARTICLES =================

    @PostMapping("/articles")
    public Article addArticle(@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

    @PutMapping("/articles/{id}")
    public Article updateArticle(@PathVariable Long id,
                                 @RequestBody Article article) {
        return articleService.updateArticle(id, article);
    }

    @DeleteMapping("/articles/{id}")
    public String deleteArticle(@PathVariable Long id) {
        articleService.deleteArticle(id);
        return "Article Deleted Successfully";
    }

    // ================= QUESTIONS =================

    @PostMapping("/questions")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.saveQuestion(question);
    }

    @PutMapping("/questions/{id}")
    public Question updateQuestion(@PathVariable Long id,
                                   @RequestBody Question question) {
        return questionService.updateQuestion(id, question);
    }

    @DeleteMapping("/questions/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
        return "Question Deleted Successfully";
    }
    // ================= USERS =================

// View all users
@GetMapping("/users")
public List<User> getAllUsers() {
    return userService.getAllUsers();
}

// Delete a user
@DeleteMapping("/users/{id}")
public String deleteUser(@PathVariable Long id) {
    userService.deleteUser(id);
    return "User Deleted Successfully";
}
}