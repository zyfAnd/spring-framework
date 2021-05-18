package cn.daliandaxue;

import cn.daliandaxue.dao.SimpleDao;
import cn.daliandaxue.entity.Person;
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

//
//        try {
//            Class<?> clazz = Class.forName("cn.daliandaxue.entity.Person");
//            Person person = (Person) clazz.newInstance();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
    }
}
