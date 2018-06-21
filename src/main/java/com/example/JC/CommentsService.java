package com.example.JC;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CommentsService {

	@Autowired
	 CommentsRepository repo;
	public  CommentsComments getComments(int Id) {
		Optional< CommentsComments> op = repo.findById(Id);
		if (op.isPresent()) {
			return op.get();
		} else {
			return null;
		}
	}
public  CommentsComments saveComments( CommentsComments comments) {
	return repo.save( comments);
}

public   CommentsComments updateComments( CommentsComments toupdateComments) {
	return repo.save(toupdateComments);
}

public void deleteComments(int Id) {
	 repo.deleteById(Id);
}

public List< CommentsComments> getall() {
	return repo.findAll();
}

public List< CommentsComments> getToutiao() {
	return repo.findTop3ByOrderById();
}
public CommentsComments deleteComments() {
	return null;
}

	
}
