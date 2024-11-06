package com.ashokit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="ashokit_posts")
public class Post {
	
	@Id
	@Column(name = "post_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int postId;
	
	@Column(name="post_title", nullable = false)
	private String postTitle;
	
	@Column(name="created_date",nullable = false)
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="created_by",nullable = false)
	private String createdBy;
	
	//onetoMany association
	/*@OneToMany(targetEntity = Comment.class, 
			   cascade = CascadeType.ALL,
			   fetch = FetchType.EAGER)
	@JoinColumn(name="post_id")*/
	@OneToMany(targetEntity = Comment.class, 
			   cascade = CascadeType.ALL,
			   fetch = FetchType.EAGER,
			   mappedBy = "post")
	private List<Comment> comments = new ArrayList<>();
	

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	public List<Comment> getComments() {
		return comments;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postTitle=" + postTitle + ", createdDate=" + createdDate + ", createdBy="
				+ createdBy + "]";
	}
}
