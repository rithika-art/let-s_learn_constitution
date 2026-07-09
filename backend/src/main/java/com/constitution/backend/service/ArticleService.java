package com.constitution.backend.service;

import com.constitution.backend.entity.Article;
import com.constitution.backend.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    // Get all articles
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }
    public Article getArticleByNumber(String articleNumber) {
    return articleRepository.findByArticleNumber(articleNumber)
            .orElseThrow(() -> new RuntimeException("Article not found"));
}

public List<Article> getArticlesByPart(String part) {
    return articleRepository.findByPart(part);
}

public List<Article> getArticlesByChapter(String chapter) {
    return articleRepository.findByChapter(chapter);
}

public List<Article> searchArticles(String keyword) {
    return articleRepository.findByTitleContainingIgnoreCase(keyword);
}

    // Save article
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }
    public Article getArticleById(Long id) {
    return articleRepository.findById(id).orElseThrow();
}

    // Update article
    public Article updateArticle(Long id, Article updatedArticle) {

        Article article = articleRepository.findById(id).orElseThrow();

        article.setArticleNumber(updatedArticle.getArticleNumber());
        article.setTitle(updatedArticle.getTitle());
        article.setPart(updatedArticle.getPart());
        article.setChapter(updatedArticle.getChapter());
        article.setContent(updatedArticle.getContent());
        article.setKeywords(updatedArticle.getKeywords());

        return articleRepository.save(article);
    }

    // Delete article
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }
}