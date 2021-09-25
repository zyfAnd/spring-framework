package cn.daliandaxue.external;

import org.springframework.stereotype.Component;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/9/25 11:21 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Component
public class HKXsellPreScreening extends NormalPrescreening{
    @Override
    public void tieBreak() {
        System.out.println("HKXsellPreScreening-tieBreak");
    }

    @Override
    public void CDE() {
        System.out.println("HKXsellPreScreening-CDE");
    }

    @Override
    public void CBA() {
        System.out.println("HKXsellPreScreening-CBA");
    }

    @Override
    public void Bureau() {
        System.out.println("HKXsellPreScreening-Bureau");
    }

    @Override
    public void Ness() {
        System.out.println("HKXsellPreScreening-Ness");
    }

    @Override
    public void FME() {
        System.out.println("HKXsellPreScreening-FME");
    }

    @Override
    public void Dedupe() {
        System.out.println("HKXsellPreScreening-Dedupe");
    }
}
