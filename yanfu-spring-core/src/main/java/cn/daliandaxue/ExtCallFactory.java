package cn.daliandaxue;

import cn.daliandaxue.external.NormalPrescreening;
import javafx.application.Application;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/9/25 11:23 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class ExtCallFactory implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, NormalPrescreening> beanMap = applicationContext.getBeansOfType(NormalPrescreening.class);
    }
}
