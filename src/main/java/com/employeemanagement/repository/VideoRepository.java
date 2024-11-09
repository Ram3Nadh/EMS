package com.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeemanagement.entity.Video;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
