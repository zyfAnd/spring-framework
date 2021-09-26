package cn.daliandaxue.external;

import org.springframework.stereotype.Component;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/9/25 11:20 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Component
public class PreScreening extends NormalPrescreening {
    @Override
    public void tieBreak() {
        System.out.println("Tie Break..");
    }

    @Override
    public void CDE() {
        System.out.println(" CDE..");
    }

    @Override
    public void CBA() {
        System.out.println(" CBA..");
    }

    @Override
    public void Bureau() {
        System.out.println(" Bureau..");
    }

    @Override
    public void Ness() {
        System.out.println(" Ness..");
    }

    @Override
    public void FME() {
        System.out.println(" FME..");
    }

    @Override
    public void Dedupe() {
        System.out.println("Dedupe..");
    }

    @Override
    public ScenariosCode getScenario() {
        return ScenariosCode.PRESCREENING;
    }
}
