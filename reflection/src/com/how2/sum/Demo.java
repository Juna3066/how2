package com.how2.sum;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo {
    /**
     * 1、类对象
     *      任何类都有类对象（Class）
     *      通过它可以获取类的相关信息
     *          属性、方法等
     * 2、创建
     *      Class.forName()
     *      Hexo.class
     *      obj.getClass()
     * 3、属性
     *      getField
     *          获取public字段、自身和父类继承的
     *      getDeclaredField
     *          获取自身所有的字段、父类继承的获取不到
     *          private属性访问需要setAccessible(true)
     *
     *          hero.name = 'xxx'
     * 4、方法
     *      m.invoke(c,param)
     *
     * 5、应用spring中
     *
     *  读取配置文件

     * @param args
     */
    public static void main(String[] args) {
        InputStream stream = ClassLoader.getSystemResourceAsStream("application.properties");
        Properties properties = new Properties();
        try {
            properties.load(stream);
            Object method = properties.get("method");
            System.out.println("method = " + method);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
