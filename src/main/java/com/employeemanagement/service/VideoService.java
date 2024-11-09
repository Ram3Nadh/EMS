package com.employeemanagement.service;

import java.util.List;
import com.employeemanagement.entity.Video;

public interface VideoService {
    List<Video> getAllVideos();
    Video getVideoById(int id);
    void saveVideo(Video video);
    void deleteVideo(int id);
}
