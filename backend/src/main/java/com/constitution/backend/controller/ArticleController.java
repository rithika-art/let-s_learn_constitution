package com.constitution.backend.controller;

import com.constitution.backend.entity.Article;
import com.constitution.backend.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    // Get all articles
    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }
    @GetMapping("/test")
public String test() {
    return "Controller Working";
}

    // Save article
    @PostMapping
    public Article saveArticle(@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

    // Update article
    @PutMapping("/{id}")
    public Article updateArticle(@PathVariable Long id,
                                 @RequestBody Article article) {
        return articleService.updateArticle(id, article);
    }

    // Delete article
    @DeleteMapping("/{id}")
    public String deleteArticle(@PathVariable Long id) {
        articleService.deleteArticle(id);
        return "Article deleted successfully!";
    }
}