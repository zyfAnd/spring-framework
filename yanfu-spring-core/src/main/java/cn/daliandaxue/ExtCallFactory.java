package cn.daliandaxue;

import cn.daliandaxue.external.CallExtService;
import cn.daliandaxue.external.NormalPrescreening;
import cn.daliandaxue.external.ScenariosCode;
import javafx.application.Application;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/9/25 11:23 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Component
public class ExtCallFactory implements ApplicationContextAware {
     Map<ScenariosCode,NormalPrescreening> map ;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, NormalPrescreening> beanMap = applicationContext.getBeansOfType(NormalPrescreening.class);
        map = new HashMap<>();
        beanMap.forEach((key, value) -> map.put(value.getScenario(),value));
    }
    public  NormalPrescreening getCallExtService(ScenariosCode scenariosCode){

        return  map.get(scenariosCode);
    }


}
