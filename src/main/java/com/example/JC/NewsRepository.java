package com.example.JC;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<NewsNews,Integer> {
	List<NewsNews> findTop3ByOrderById();


}
