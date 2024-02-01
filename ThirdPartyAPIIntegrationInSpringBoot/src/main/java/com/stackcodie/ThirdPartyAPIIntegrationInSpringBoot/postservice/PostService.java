package com.stackcodie.ThirdPartyAPIIntegrationInSpringBoot.postservice;

import java.util.List;
import java.util.Map;

public interface PostService {

	List<Map<String, Object>> getPost();
	
	Map<String, Object> getPostById(int id); 
	
	Map<String, Object> insertPosts(Map<String, Object> payload);
	
	Map<String, Object> updatePosts(Map<String, Object> payload, int id);
	
	Map<String, Object> deletePosts(int id);


}
