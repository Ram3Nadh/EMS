package com.employeemanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.employeemanagement.entity.Video;
import com.employeemanagement.service.VideoService;

@Controller
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("/videos")
    public String listVideos(Model model) {
        List<Video> videos = videoService.getAllVideos();
        model.addAttribute("videoList", videos);
        return "video_list"; // Create a Thymeleaf template for listing videos
    }

    @GetMapping("/addVideo")
    public String showAddVideoForm(Model model) {
        model.addAttribute("video", new Video());
        return "video_form"; // Create a Thymeleaf template for the video form
    }

    @PostMapping("/saveVideo")
    public String saveVideo(@ModelAttribute Video video) {
        videoService.saveVideo(video);
        return "redirect:/videos";
    }

    @GetMapping("/editVideo/{id}")
    public String showEditVideoForm(@PathVariable int id, Model model) {
        Video video = videoService.getVideoById(id);
        model.addAttribute("video", video);
        return "video_form"; // Reuse the same form for editing
    }

    @GetMapping("/deleteVideo/{id}")
    public String deleteVideo(@PathVariable int id) {
        videoService.deleteVideo(id);
        return "redirect:/videos";
    }
}
