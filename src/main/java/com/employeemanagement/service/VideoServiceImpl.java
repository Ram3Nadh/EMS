package com.employeemanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employeemanagement.entity.Video;
import com.employeemanagement.repository.VideoRepository;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    @Override
    public Video getVideoById(int id) {
        return videoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveVideo(Video video) {
        videoRepository.save(video);
    }

    @Override
    public void deleteVideo(int id) {
        videoRepository.deleteById(id);
    }
}
