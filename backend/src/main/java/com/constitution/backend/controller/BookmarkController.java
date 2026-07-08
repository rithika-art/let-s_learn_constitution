package com.constitution.backend.controller;

import com.constitution.backend.entity.Bookmark;
import com.constitution.backend.entity.User;
import com.constitution.backend.service.BookmarkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookmarks")
public class BookmarkController {

    private final BookmarkService bookmarkService;

    public BookmarkController(BookmarkService bookmarkService) {
        this.bookmarkService = bookmarkService;
    }

    @GetMapping("/user")
    public List<Bookmark> getBookmarksByUser(@RequestBody User user) {
        return bookmarkService.getBookmarksByUser(user);
    }

    @PostMapping
    public Bookmark saveBookmark(@RequestBody Bookmark bookmark) {
        return bookmarkService.saveBookmark(bookmark);
    }

    @DeleteMapping("/{id}")
    public String deleteBookmark(@PathVariable Long id) {
        bookmarkService.deleteBookmark(id);
        return "Bookmark deleted successfully!";
    }
}