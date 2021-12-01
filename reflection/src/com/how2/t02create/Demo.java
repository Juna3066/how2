package com.how2.t02create;

import com.how2.t01ldx.Hero;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * 通过类对象
 *      创建对象
 */
public class Demo {
    public static void main(String[] args) {
        //test01();
        //pra01();
        pra02();
    }

    /**
     * 通过反射机制创建一个对象
     */
    private static void test01() {
        //传统的使用new的方式创建对象
        Hero h1 =new Hero();
        h1.name = "teemo";
        System.out.println(h1);

        try {
            //使用反射的方式创建对象
            String className = "com.how2.t01ldx.Hero";
            //类对象
            Class pClass=Class.forName(className);
            //构造器
            Constructor c= pClass.getConstructor();
            //通过构造器实例化
            Hero h2= (Hero) c.newInstance();
            h2.name="gareen";
            System.out.println(h2);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void pra01() {
        try {
            Class<?> cla = Class.forName("com.how2.t01ldx.Hero");
            Hero hero = (Hero) cla.getConstructor().newInstance();
            hero.damage = 100;
            System.out.println("hero = " + hero);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 02、读取配置文件，创建对象
     */
    private static void pra02() {
        InputStream stream = ClassLoader.getSystemResourceAsStream("hero.config");
        Properties properties = new Properties();
        try {
            properties.load(stream);
            String className = properties.get("ClassName").toString();
            Class<?> aClass = Class.forName(className);
            Hero hero = (Hero) aClass.getConstructor().newInstance();
            System.out.println("hero = " + hero);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
