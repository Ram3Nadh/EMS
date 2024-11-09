package com.employeemanagement.service;

import java.util.List;
import com.employeemanagement.entity.Article;

public interface ArticleService {
    Article saveArticle(Article article);
    List<Article> getAllArticles();
    Article getArticleById(int id);
    boolean deleteArticle(int id);
}
