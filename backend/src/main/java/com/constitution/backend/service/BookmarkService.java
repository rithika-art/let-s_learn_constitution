package com.constitution.backend.service;

import com.constitution.backend.entity.Bookmark;
import com.constitution.backend.entity.User;
import com.constitution.backend.repository.BookmarkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    public BookmarkService(BookmarkRepository bookmarkRepository) {
        this.bookmarkRepository = bookmarkRepository;
    }

    public List<Bookmark> getBookmarksByUser(User user) {
        return bookmarkRepository.findByUser(user);
    }

    public Bookmark saveBookmark(Bookmark bookmark) {
        return bookmarkRepository.save(bookmark);
    }

    public void deleteBookmark(Long id) {
        bookmarkRepository.deleteById(id);
    }
}