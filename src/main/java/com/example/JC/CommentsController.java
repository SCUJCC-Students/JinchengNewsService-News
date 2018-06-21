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
@RequestMapping("/comments")
public class CommentsController {
	private final static Logger log = LoggerFactory.getLogger(CommentsController.class);
		
		@Autowired
		private CommentsService CommentsService;
		
		@GetMapping(path="/comments/{id}")
		public CommentsComments getComments(@PathVariable("id") int Id) {
			CommentsComments result = CommentsService.getComments(Id);
			log.debug("准备读取评论:" + Id);
			return result;
		}
		
		@GetMapping(path="/all")
		public List<CommentsComments> getall() {
			List<CommentsComments> result = CommentsService.getall();
			CommentsService.getall();
			return result;
		}
		
		@GetMapping(path="/toutiao")
		public List<CommentsComments> getToutiao() {
			List<CommentsComments> result = CommentsService.getToutiao();
			CommentsService.getToutiao();
			return result;
		}
		
		@PostMapping(path="/comments/add")
		public CommentsComments saveComments(@RequestBody CommentsComments comments) {
			CommentsComments result = CommentsService.saveComments(comments);
			log.debug("刚刚保存的评论id是" + result.getId());
			return result;
		}
		
		@PutMapping(path="/comments/gengxin")
		public CommentsComments updateComments(@RequestBody CommentsComments toupdateComments) {
			CommentsComments result = CommentsService.updateComments(toupdateComments) ;
			log.debug(toupdateComments.toString());
			return result;
		}
		
		@DeleteMapping(path="/comments/{id}")
		public CommentsComments deleteComments(@PathVariable("id") int Id) {
			CommentsComments result = CommentsService.deleteComments();
			log.debug("即将删除编号为"+Id+"的评论");
			return result;
		}
		

	}



