package cn.daliandaxue;

import cn.daliandaxue.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/4/26 2:47 下午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanName:beanDefinitionNames) {
			System.out.println(beanName);
		}
	}
}
