package cn.daliandaxue;

import cn.daliandaxue.entity.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/4/28 1:18 下午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SimpleBean bean = context.getBean(SimpleBean.class);
		bean.send();
		context.close();
	}
}
