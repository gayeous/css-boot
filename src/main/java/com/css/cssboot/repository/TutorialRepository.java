package com.css.cssboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.css.cssboot.model.Tutorial;

 

public interface TutorialRepository extends JpaRepository<com.css.cssboot.model.Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
