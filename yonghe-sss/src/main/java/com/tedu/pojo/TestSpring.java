package com.tedu.pojo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
		
	@SuppressWarnings("resource")
	@Test
	public void testSpring() {
//		����spring�ĺ��������ļ�
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
//		 ��ȡbeanʵ��
		User user = (User) ac.getBean("user");
		System.out.println(user);
		
	}
}
