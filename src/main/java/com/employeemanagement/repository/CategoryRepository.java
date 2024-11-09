package com.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeemanagement.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
