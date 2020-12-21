package com.zzf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("hello");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User u = (User) context.getBean("user");
		System.out.println(u.toString());
	}
}
