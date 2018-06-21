package com.example.JC;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<CommentsComments,Integer> {
	List<CommentsComments> findTop3ByOrderById();

}
