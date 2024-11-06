package com.ashokit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Comment;

public interface CommentDao extends JpaRepository<Comment, Integer>{

}
