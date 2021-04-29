package cn.daliandaxue;


import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/4/28 4:08 下午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class MySpringServletContainerInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		System.out.println("Startup..");
	}
}
