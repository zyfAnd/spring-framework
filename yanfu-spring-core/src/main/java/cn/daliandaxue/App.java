package cn.daliandaxue;


import cn.daliandaxue.entity.SimpleBean;
import cn.daliandaxue.external.NormalPrescreening;
import cn.daliandaxue.external.ScenariosCode;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
		//关闭容器
//		context.close();
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.daliandaxue");
//		ExtCallFactory factory = context.getBean(ExtCallFactory.class);
//		NormalPrescreening prescreening  =factory.getCallExtService(ScenariosCode.HKXSell);
//		prescreening.init();
	}
}
