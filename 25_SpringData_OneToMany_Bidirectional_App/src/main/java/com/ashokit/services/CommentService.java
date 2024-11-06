package com.ashokit.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.CommentDao;
import com.ashokit.entity.Comment;

@Service
public class CommentService {
	
	@Autowired
	private CommentDao commentDao;

	//saving the comments info
	public void saveCommentToPostData(List<Comment> commentList) {		
		List<Comment> savedInfo = commentDao.saveAll(commentList);		
		if(savedInfo != null && savedInfo.size() > 0) {
			System.out.println("Data Saved Successfully.......");
		}		
	}	
	
	//testing functionality loading comment info along post info or not
	public void loadChildInfo(Integer commentId) {
	   Optional<Comment> commentInfo = commentDao.findById(commentId);		  
	   if(commentInfo.isPresent()) {			  
		  Comment comment = commentInfo.get();
		  System.out.println("Comment Information :::::" + comment);
		  System.out.println("Post Information :::::" + comment.getPost());
	   }else {
		  throw new IllegalArgumentException("Given CommentID is Not Existed");
	  }
	}
	
	//testing the functionality when deleting child automatically parent is deleting
	public void removeChildWithParentData(List<Integer> commentId) {
		List<Comment> allComments = commentDao.findAllById(commentId);		
		if(allComments != null && allComments.size() > 0) {
			commentDao.deleteAll(allComments);
			System.out.println("All Data Got Deleted Successfully.......");
		}else {
			System.out.println("No Comments");
		}
	}
}
