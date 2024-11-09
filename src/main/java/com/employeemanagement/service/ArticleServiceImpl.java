package com.employeemanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employeemanagement.entity.Article;
import com.employeemanagement.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepo;

    @Override
    public Article saveArticle(Article article) {
        return articleRepo.save(article);
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepo.findAll();
    }

    @Override
    public Article getArticleById(int id) {
        return articleRepo.findById(id).orElse(null);
    }

    @Override
    public boolean deleteArticle(int id) {
        if (articleRepo.existsById(id)) {
            articleRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
