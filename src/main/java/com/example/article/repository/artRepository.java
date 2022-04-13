package com.example.article.repository;

import com.example.article.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface artRepository extends JpaRepository<Article,Long> {
}
