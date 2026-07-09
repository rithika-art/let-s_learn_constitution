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

    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/article/{articleNumber}")
    public Article getArticleByNumber(@PathVariable String articleNumber) {
        return articleService.getArticleByNumber(articleNumber);
    }

    @GetMapping("/part/{part}")
    public List<Article> getArticlesByPart(@PathVariable String part) {
        return articleService.getArticlesByPart(part);
    }

    @GetMapping("/chapter/{chapter}")
    public List<Article> getArticlesByChapter(@PathVariable String chapter) {
        return articleService.getArticlesByChapter(chapter);
    }

    @GetMapping("/search")
    public List<Article> searchArticles(@RequestParam String keyword) {
        return articleService.searchArticles(keyword);
    }

    @PostMapping
    public Article saveArticle(@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

    @PutMapping("/{id}")
    public Article updateArticle(@PathVariable Long id,
                                 @RequestBody Article article) {
        return articleService.updateArticle(id, article);
    }
    @GetMapping("/{id}")
public Article getArticleById(@PathVariable Long id) {
    return articleService.getArticleById(id);
}

    @DeleteMapping("/{id}")
    public String deleteArticle(@PathVariable Long id) {
        articleService.deleteArticle(id);
        return "Article deleted successfully!";
    }
}