package cn.daliandaxue.external;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 * @Authour Zhang Yanfu
 * @Date 2021/9/25 11:17 上午
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */

public abstract class NormalPrescreening implements CallExtService {

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
