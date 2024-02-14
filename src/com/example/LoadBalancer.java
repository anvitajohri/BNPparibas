package com.example;

public interface LoadBalancer {
	
	void addResource(String resource);
	String getNextResource();
    String getRandomResource();
}
