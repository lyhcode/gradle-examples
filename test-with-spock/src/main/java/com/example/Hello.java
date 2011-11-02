package com.example;

public class Hello {
	public String sayHello(String who) {
		System.out.println("Say hello to " + who);
		System.err.println("Error: Say hello to " + who);
		return "Hello " + who;
	}
}
