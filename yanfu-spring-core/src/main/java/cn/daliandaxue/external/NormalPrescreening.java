package cn.daliandaxue.external;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/9/25 11:17 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Component
public abstract class NormalPrescreening implements CallExtService {


    @PostConstruct
    @Override
    public void init() {
        tieBreak();
        FME();
        Dedupe();
        Ness();
        CBA();
        CDE();
        Bureau();
    }


}
