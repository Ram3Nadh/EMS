package com.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeemanagement.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
