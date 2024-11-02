package com.ashokit;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.dao.CommentDao;
import com.ashokit.dao.PostDao;
import com.ashokit.entity.Comment;
import com.ashokit.entity.Post;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private PostDao postDao;
	
	@Autowired
	private CommentDao commentDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {		
		
		//First Post Information
		/*Post post = new Post();
		post.setPostTitle("Spring Boot Post");
		post.setCreatedDate(new Timestamp(new Date().getTime()));
		post.setCreatedBy("Mahesh");
		
		//Binding the First comment for First Post
		Comment firstComment = new Comment();
		firstComment.setCommentInfo("Informative Session");
		firstComment.setCreatedDate(new Date());
		firstComment.setCreatedBy("Suresh");
		
		//Binding the Second comment for First Post
		Comment secondComment = new Comment();
		secondComment.setCommentInfo("Good Session");
		secondComment.setCreatedDate(new Timestamp(new Date().getTime()));
		secondComment.setCreatedBy("Ramesh");
		
		//parent to child saving records
		post.setComments(List.of(firstComment,secondComment));
		
		//saving the parent object
		Post postInfo = postDao.save(post);
		System.out.println("Post Information::::" + postInfo);
		
		//Second Post Information
		Post post1 = new Post();
		post1.setPostTitle("Devops With AWS Post");
		post1.setCreatedDate(new Date());
		post1.setCreatedBy("Ashok");
		
		//Binding the First comment for Second Post
		Comment firstPostComment = new Comment();
		firstPostComment.setCommentInfo("Informative Session");
		firstPostComment.setCreatedDate(new Date());
		firstPostComment.setCreatedBy("Suresh");
		
		//Binding the First comment for Second Post
		Comment secondPostComment = new Comment();
		secondPostComment.setCommentInfo("Good Session");
		secondPostComment.setCreatedDate(new Date());
		secondPostComment.setCreatedBy("Ashok");
		
		//Binding the First comment for Second Post
		Comment thirdPostComment = new Comment();
		thirdPostComment.setCommentInfo("Good Informative Session");
		thirdPostComment.setCreatedDate(new Date());
		thirdPostComment.setCreatedBy("Ashok");
		
		//setting parent to child object
		post1.setComments(List.of(firstPostComment,secondPostComment,thirdPostComment));
		
		Post savedFirstPostInfo = postDao.save(post1);
		System.out.println("Saved First Post Info ::::::" + savedFirstPostInfo);*/
		
		//loading the parent object
        Post post11 = postDao.findById(1).get();
		System.out.println("Loading Post Information ::::" + post11);		
		System.out.println("Loading Post  & Comment Information ::::" + post11.getComments());
		
		//deleting parent object associated child objects should be deleted
		postDao.deleteById(1);
	}
}
