package cn.daliandaxue;

import cn.daliandaxue.config.MainConfig;
import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLInputFactory;

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
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactoryImpl.newInstance();
		documentBuilderFactory.setAttribute(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES,false);
		webApplicationContext.getBeanDefinitionNames();
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanName:beanDefinitionNames) {
			System.err.println(beanName);
		}
	}
}
