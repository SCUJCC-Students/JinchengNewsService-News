package com.example.JC;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {
	private final static Logger log = LoggerFactory.getLogger(NewsController.class);
		
		@Autowired
		private NewsService NewsService;
		
		@GetMapping(path="/news/{id}")
		public NewsNews getNews(@PathVariable("id") int Id) {
			NewsNews result = NewsService.getNews(Id);
			log.debug("准备读取评论:" + Id);
			return result;
		}
		
		@GetMapping(path="/all")
		public List<NewsNews> getall() {
			List<NewsNews> result = NewsService.getall();
			NewsService.getall();
			return result;
		}
		
		@GetMapping(path="/toutiao")
		public List<NewsNews> getToutiao() {
			List<NewsNews> result =NewsService.getToutiao();
			NewsService.getToutiao();
			return result;
		}
		
		@PostMapping(path="/news/add")
		public NewsNews saveNews(@RequestBody NewsNews news) {
			NewsNews result = NewsService.saveNews(news);
			log.debug("刚刚保存的评论id是" + result.getId());
			return result;
		}
		
		@PutMapping(path="/news/gengxin")
		public NewsNews updateNews(@RequestBody NewsNews toupdateNews) {
			NewsNews result = NewsService.updateNews(toupdateNews) ;
			log.debug(toupdateNews.toString());
			return result;
		}
		
		@DeleteMapping(path="/news/{id}")
		public NewsNews deleteNews(@PathVariable("id") int Id) {
			NewsNews result = NewsService.deleteNews();
			log.debug("即将删除编号为"+Id+"的评论");
			return result;
		}
		

	}

