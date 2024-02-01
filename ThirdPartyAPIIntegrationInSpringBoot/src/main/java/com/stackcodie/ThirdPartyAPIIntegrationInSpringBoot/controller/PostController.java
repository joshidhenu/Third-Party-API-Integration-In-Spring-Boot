package com.stackcodie.ThirdPartyAPIIntegrationInSpringBoot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackcodie.ThirdPartyAPIIntegrationInSpringBoot.postservice.PostService;

@RestController
@RequestMapping("/api")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/getPosts")
	List<Map <String, Object>> getAllPosts(){
		return postService.getPost(); 
	}
	
	@GetMapping("/getPostsById/{id}")
	Map<String, Object> getPostsById(@PathVariable int id){
		return postService.getPostById(id); 
	}
	
	@PostMapping("/insertPosts")
	Map<String, Object> insertsPsots(@RequestBody Map<String, Object> payload){
		return postService.insertPosts(payload);
	}

	@PutMapping("/updatePosts/{id}")
	Map<String, Object> updatePosts(@RequestBody Map<String, Object> payload,@PathVariable int id){
		return postService.updatePosts(payload, id);
	}
	
	@DeleteMapping("/deletePosts/{id}")
	Map<String, Object> deletePosts (@PathVariable int id){
		return postService.deletePosts(id);
	}
}
