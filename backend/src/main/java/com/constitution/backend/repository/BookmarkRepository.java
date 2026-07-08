package com.constitution.backend.repository;

import com.constitution.backend.entity.Bookmark;
import com.constitution.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    List<Bookmark> findByUser(User user);

}