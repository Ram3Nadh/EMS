package com.employeemanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.employeemanagement.entity.Article;
import com.employeemanagement.service.ArticleService;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/articles")
    public String listArticles(Model model) {
        List<Article> articles = articleService.getAllArticles();
        model.addAttribute("articleList", articles);
        return "article_list";
    }

    @GetMapping("/addArticle")
    public String showAddArticleForm(Model model) {
        model.addAttribute("article", new Article());
        return "article_form";
    }

    @PostMapping("/saveOrUpdateArticle")
    public String saveOrUpdateArticle(@ModelAttribute Article article) {
        articleService.saveArticle(article);  // Save handles both create and update based on ID presence
        return "redirect:/articles";
    }

    @GetMapping("/editArticle/{id}")
    public String showEditArticleForm(@PathVariable int id, Model model) {
        Article article = articleService.getArticleById(id);
        model.addAttribute("article", article);
        return "article_form";
    }

    @GetMapping("/deleteArticle/{id}")
    public String deleteArticle(@PathVariable int id) {
        articleService.deleteArticle(id);
        return "redirect:/articles";
    }
}