package com.satyam.blog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.satyam.blog.payloads.PostDto;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//get all
	List<PostDto> getAllPost();
	
	//get all post by user
	List<PostDto> getPostByUser(Integer userId);
	
	//get all post by category
	List<PostDto> getPostByCategory(Integer categoryId);
	
}
