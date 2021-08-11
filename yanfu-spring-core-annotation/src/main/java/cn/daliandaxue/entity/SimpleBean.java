package cn.daliandaxue.entity;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/5/11 10:53 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class SimpleBean {
    public SimpleBean() {
        System.out.println("simple bean construct..");
    }

    public void send(){
        System.out.println("I am simple bean send...");
    }
    public void init(){
        System.out.println("SimpleBean init..");
    }
    public void destroy(){
        System.out.println("SimpleBean Destroy..");
    }
}
