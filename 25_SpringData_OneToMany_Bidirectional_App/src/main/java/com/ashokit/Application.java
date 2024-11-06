package com.ashokit;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.dao.CommentDao;
import com.ashokit.dao.Customers;
import com.ashokit.dao.CustomersDao;
import com.ashokit.dao.PostDao;
import com.ashokit.entity.Comment;
import com.ashokit.entity.Post;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private PostDao postDao;
	
	@Autowired
	private CommentDao commentDao;
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private CustomersDao customersDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//DataSource:::::com.zaxxer.hikari.HikariDataSource (Default)
		//DataSource:::::org.apache.tomcat.jdbc.pool.DataSource(Tomcat)
		//DataSource:::::org.apache.commons.dbcp2.BasicDataSource(dpcp2)
		System.out.println("DataSource:::::" + dataSource.getClass().getName());
		//First Post Information
		/*Post post = new Post();
		post.setPostTitle("Spring Boot Post");
		post.setCreatedDate(new Date());
		post.setCreatedBy("Mahesh");
		
		//Binding the First comment for First Post
		Comment firstComment = new Comment();
		firstComment.setCommentInfo("Informative Session");
		firstComment.setCreatedDate(new Date());
		firstComment.setCreatedBy("Suresh");
		firstComment.setPost(post); //mappedBy attribute
		
		//Binding the Second comment for First Post
		Comment secondComment = new Comment();
		secondComment.setCommentInfo("Good Session");
		secondComment.setCreatedDate(new Date());
		secondComment.setCreatedBy("Ramesh");
		secondComment.setPost(post);//mappedBy attribute
		
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
		firstPostComment.setPost(post1); //mappedBy attribute
		
		//Binding the First comment for Second Post
		Comment secondPostComment = new Comment();
		secondPostComment.setCommentInfo("Good Session");
		secondPostComment.setCreatedDate(new Date());
		secondPostComment.setCreatedBy("Ashok");
		secondPostComment.setPost(post1); //mappedBy attribute
		
		//Binding the First comment for Second Post
		Comment thirdPostComment = new Comment();
		thirdPostComment.setCommentInfo("Good Informative Session");
		thirdPostComment.setCreatedDate(new Date());
		thirdPostComment.setCreatedBy("Ashok");
		thirdPostComment.setPost(post1); //mappedBy attribute
		
		//setting parent to child object
		post1.setComments(List.of(firstPostComment,secondPostComment,thirdPostComment));
		
		Post savedFirstPostInfo = postDao.save(post1);
		System.out.println("Saved First Post Info ::::::" + savedFirstPostInfo);*/
		
		//Post To Comment Navigation
		Optional<Post> postInfo1 = postDao.findById(1);
		if(postInfo1.isPresent()) {
			Post postData = postInfo1.get();
			System.out.println(postData);
			postData.getComments().forEach(eachComment -> System.out.println(eachComment));
		}
		
		//Comment To Post Navigation
		Optional<Comment> commentInfo = commentDao.findById(1);
		if(commentInfo.isPresent()) {
			Comment commentData = commentInfo.get();
			System.out.println(commentData);
			Post commentRelatedPost = commentData.getPost();
			System.out.println(commentRelatedPost);
		}
		Customers cust= new Customers();
		cust.setFirsName("Ashok");
		cust.setLastName("Kumar");
		cust.setCustomerLcoation("Hyderabad");
		Customers savedCustomer = customersDao.save(cust);
		System.out.println(savedCustomer);
		System.out.println(savedCustomer.getFullName());
		
	}
}
