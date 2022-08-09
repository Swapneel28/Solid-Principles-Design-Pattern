package com.design.pattern.Learning.simple.factory.pattern;

import java.time.LocalDate;

public class NewsPost extends Post {
	
	private String headLine;
	private LocalDate newsTime;
	
	public String getHeadLine() {
		return headLine;
	}
	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}
	public LocalDate getNewsTime() {
		return newsTime;
	}
	public void setNewsTime(LocalDate newsTime) {
		this.newsTime = newsTime;
	}
	
	@Override
	public String toString() {
		return "NewsPost [headLine=" + headLine + ", newsTime=" + newsTime + "]";
	}
	
	

}
