package cn.daliandaxue.entity;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/5/4 4:09 下午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class SimpleBean {
    public void send(){
        System.out.println("I ams just simple Bean for sending message ..");
    }
    /**
    * @description:
     * @author: Yanfu
     * init methid . after the construct excuted
     */
    public void init(){
        System.out.println("init...");
    }
    public void destroy(){
        System.out.println("destroy...");
    }
}
