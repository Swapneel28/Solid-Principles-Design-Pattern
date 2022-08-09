package com.design.pattern.Learning.simple.factory.pattern;

public class PostFactory {
	
	
	public static Post createPost(String type) {
		switch(type) {
		  case "blog" : 
			   return new BlogPost();
		  case "news" : 
			   return new NewsPost();
		  case "Product" : 
			   return new ProductPost();
		  default : 
			   throw new IllegalArgumentException("Post type is unknown.");
		}
	}

}
