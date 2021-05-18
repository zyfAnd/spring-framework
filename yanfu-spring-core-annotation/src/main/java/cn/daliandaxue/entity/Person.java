package cn.daliandaxue.entity;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/5/14 3:58 下午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Component
public class Person implements ApplicationContextAware {

    public Person() {
        System.out.println("Person construct..");
    }

    /**
    * @description:
     * @author: Yanfu
     *
     */

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("---ApplicaitonContext..");
    }
}
