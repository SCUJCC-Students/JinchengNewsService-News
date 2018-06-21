package com.example.JC;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {

	@Autowired
	 NewsRepository repo;
	public  NewsNews getNews(int newsId) {
		Optional< NewsNews> op = repo.findById(newsId);
		if (op.isPresent()) {
			return op.get();
		} else {
			return null;
		}
	}
	public  NewsNews saveNews( NewsNews news) {
		return repo.save(news);
	}

	public  NewsNews updateNews( NewsNews toupdateNews) {
		return repo.save(toupdateNews);
	}

	
	
	public List< NewsNews> getall() {
		return repo.findAll();
	}

	public List< NewsNews> getToutiao() {
		return repo.findTop3ByOrderById();
	}
	public NewsNews deleteNews() {
		return  null;
	}

		
}
