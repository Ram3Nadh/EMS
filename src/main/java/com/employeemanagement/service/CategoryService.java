package com.employeemanagement.service;

import java.util.List;
import com.employeemanagement.entity.Category;

public interface CategoryService {
    Category saveCategory(Category category);
    List<Category> getAllCategories();
    Category getCategoryById(int id);
    boolean deleteCategory(int id);
}
