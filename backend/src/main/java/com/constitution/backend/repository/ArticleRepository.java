package com.constitution.backend.repository;

import com.constitution.backend.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    Optional<Article> findByArticleNumber(String articleNumber);

    List<Article> findByPart(String part);

    List<Article> findByChapter(String chapter);

    List<Article> findByTitleContainingIgnoreCase(String keyword);

}