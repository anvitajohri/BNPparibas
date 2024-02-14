package com.example;

public class LoadBalancerMain {
	
	public static void main(String[] args) {
		RoundRobinLoadBalancer loadBalancer = new RoundRobinLoadBalancer();
		loadBalancer.addResource("Resource 1");
		loadBalancer.addResource("Resource 2");
		loadBalancer.addResource("Resource 3");
		for(int i=0; i<6; i++) {
			System.out.println(loadBalancer.getNextResource());
		}
		for(int i=0; i<3; i++) {
			System.out.println(loadBalancer.getRandomResource());
		}
	}

	
	// assertequals("R
}
