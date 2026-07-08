package com.constitution.backend.repository;

import com.constitution.backend.entity.Progress;
import com.constitution.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProgressRepository extends JpaRepository<Progress, Long> {

    Optional<Progress> findByUser(User user);

}