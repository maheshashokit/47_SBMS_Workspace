package com.ashokit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Post;

public interface PostDao extends JpaRepository<Post, Integer>{

}
