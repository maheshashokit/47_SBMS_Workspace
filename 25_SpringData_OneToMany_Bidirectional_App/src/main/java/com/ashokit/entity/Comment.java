package com.ashokit.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="ashokit_comments")
public class Comment {
	
	@Id
	@Column(name = "comment_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int commentId;
	
	@Column(name="comment_info", nullable = false)
	private String commentInfo;
	
	@Column(name="created_date",nullable = false)
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="created_by",nullable = false)
	private String createdBy;
	
	//creating manyToOne Association
	@ManyToOne(targetEntity = Post.class, 
			   cascade =  CascadeType.ALL,
			   fetch = FetchType.LAZY)
	@JoinColumn(name="post_id")
	private Post post;

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getCommentInfo() {
		return commentInfo;
	}

	public void setCommentInfo(String commentInfo) {
		this.commentInfo = commentInfo;
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
	
	public Post getPost() {
		return post;
	}
	
	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", commentInfo=" + commentInfo + ", createdDate=" + createdDate
				+ ", createdBy=" + createdBy + "]";
	}
}