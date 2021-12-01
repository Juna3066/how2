package com.how2.t04minvoke;

import com.how2.t03gfield.DQHero;

import java.lang.reflect.Method;

/**
 * 方法调用
 */
public class Demo {
    public static void main(String[] args) {
        DQHero dqHero = new DQHero();
        dqHero.setName("药尘");
        dqHero.setLevel("斗圣");

        try {
            Method addGf = dqHero.getClass().getMethod("addGf", String.class);
            addGf.invoke(dqHero,"冷火崩裂");

            System.out.println("dqHero = " + dqHero.getGfs());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
