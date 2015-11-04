package com.ttrh.repairs.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoader;

public class ApplicationContextUtil {
	private static ApplicationContext ctx;

	@SuppressWarnings("unchecked")
	public synchronized static <T> T getBean(String beanId) {

		if (ctx == null) {
			initContext();
		}

		return (T) ctx.getBean(beanId);
	}

	private static void initContext() {

		ctx = null;
		ctx = ContextLoader.getCurrentWebApplicationContext();
		if (ctx == null) {

			ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
			// ctx = new ClassPathXmlApplicationContext(new
			// String[]{"applicationContext.xml","applicationContext-beans.xml"});
		}
	}
}
