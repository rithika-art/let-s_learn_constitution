package com.constitution.backend.repository;

import com.constitution.backend.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findByCategory(String category);

    List<Question> findByDifficulty(String difficulty);

}