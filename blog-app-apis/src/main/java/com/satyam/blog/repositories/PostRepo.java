package com.satyam.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyam.blog.entities.Category;
import com.satyam.blog.entities.Post;
import com.satyam.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);
}
