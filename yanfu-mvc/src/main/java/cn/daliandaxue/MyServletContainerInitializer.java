package cn.daliandaxue;

import org.springframework.web.SpringServletContainerInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/4/29 8:59 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class MyServletContainerInitializer extends SpringServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> webAppInitializerClasses, ServletContext servletContext) throws ServletException {
        super.onStartup(webAppInitializerClasses, servletContext);
    }
}
