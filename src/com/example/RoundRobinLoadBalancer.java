package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoundRobinLoadBalancer implements LoadBalancer{
	
	private List<String> resources = new ArrayList<>();
	private int currentIndex = 0;
	private final Object lock = new Object();

	@Override
	public void addResource(String resource) {
		// TODO Auto-generated method stub
		synchronized(lock) {
		resources.add(resource);
		}
	}

	@Override
	public String getNextResource() {
		synchronized(lock) {
		if(resources.isEmpty()) {
		return null;
		}
		String nextResource = resources.get(currentIndex);
		currentIndex = (currentIndex + 1) % resources.size();
		return nextResource;
		}
	}
	
	@Override
	public String getRandomResource() {
		synchronized(lock) {
		if(resources.isEmpty()) {
		return null;
		}
		int randomIndex = new Random().nextInt(resources.size());
		
		return resources.get(randomIndex);
	}
	}
}
