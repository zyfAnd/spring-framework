package cn.daliandaxue;

import cn.daliandaxue.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/4/26 2:47 下午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("");
		classPathXmlApplicationContext.getBeanDefinitionNames();
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		WebApplicationContext webApplicationContext  = new GenericWebApplicationContext();

		webApplicationContext.getBeanDefinitionNames();
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanName:beanDefinitionNames) {
			System.err.println(beanName);
		}
	}
}
