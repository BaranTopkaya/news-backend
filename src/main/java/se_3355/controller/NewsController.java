package se_3355.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se_3355.entity.News;
import se_3355.repository.NewsRepository;

import java.util.List;

@RestController
@RequestMapping("/api/news")
@CrossOrigin(origins = "*")
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }
}
