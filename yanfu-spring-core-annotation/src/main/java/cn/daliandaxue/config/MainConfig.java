package cn.daliandaxue.config;

import cn.daliandaxue.entity.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/5/11 4:04 下午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Configuration
public class MainConfig {

    /**
    * @description:
     * @author: Yanfu
     * Bean 的生命周期 实例化 --> 初始化-->销毁
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    SimpleBean getSimpleBean(){

        return new SimpleBean();
    }
}
