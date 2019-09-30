package com.tedu.pojo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
		
	@SuppressWarnings("resource")
	@Test
	public void testSpring() {
//		加载spring的核心配置文件
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
//		 获取bean实例
		User user = (User) ac.getBean("user");
		System.out.println(user);
		
	}
}
