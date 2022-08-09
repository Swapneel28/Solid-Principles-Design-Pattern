package com.design.pattern.Learning.simple.factory.pattern;

public class Main {

	public static void main(String[] args) {

		Post post = PostFactory.createPost("news");
		System.out.println(post.toString());
	}

}
