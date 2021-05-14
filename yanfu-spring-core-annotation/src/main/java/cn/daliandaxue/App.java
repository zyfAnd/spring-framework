package cn.daliandaxue;

import cn.daliandaxue.dao.SimpleDao;
import cn.daliandaxue.entity.SimpleBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/5/11 10:53 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.daliandaxue");
        SimpleDao simeplDao = context.getBean("simpleDao", SimpleDao.class);
        System.out.println(simeplDao);
        context.close();
    }
}
