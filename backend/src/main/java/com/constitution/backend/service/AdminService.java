package com.constitution.backend.service;

import com.constitution.backend.dto.AdminDashboardResponse;
import com.constitution.backend.repository.ArticleRepository;
import com.constitution.backend.repository.BookmarkRepository;
import com.constitution.backend.repository.QuestionRepository;
import com.constitution.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final UserRepository userRepository;
    private final ArticleRepository articleRepository;
    private final QuestionRepository questionRepository;
    private final BookmarkRepository bookmarkRepository;

    public AdminService(UserRepository userRepository,
                        ArticleRepository articleRepository,
                        QuestionRepository questionRepository,
                        BookmarkRepository bookmarkRepository) {

        this.userRepository = userRepository;
        this.articleRepository = articleRepository;
        this.questionRepository = questionRepository;
        this.bookmarkRepository = bookmarkRepository;
    }

    public AdminDashboardResponse getDashboard() {

        AdminDashboardResponse dashboard = new AdminDashboardResponse();

        dashboard.setTotalUsers(userRepository.count());
        dashboard.setTotalArticles(articleRepository.count());
        dashboard.setTotalQuestions(questionRepository.count());
        dashboard.setTotalBookmarks(bookmarkRepository.count());

        return dashboard;
    }
}