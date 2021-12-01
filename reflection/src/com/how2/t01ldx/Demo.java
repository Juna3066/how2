package com.how2.t01ldx;

/**
 * 1、类对象定义：
     * 所有的类，都有类对象
     * 用来获取类的相关信息
     * 如方法、属性
 *
 */
public class Demo {
    public static void main(String[] args) {
        //test01();
        test02();

        //练习：在静态方法上加上synchronized,同步对象是什么
        //之前的练习：在静态方法上加synchronized
    }

    /**
     * 02、在一个ClassLoader中（通常一个JVM只会有一个ClassLoader），一个类的类对象只有一个
     */
    private static void test01() {
        String className = "com.how2.t01ldx.Hero";
        try {
            Class pClass1=Class.forName(className);
            Class pClass2=Hero.class;
            Class pClass3=new Hero().getClass();
            System.out.println(pClass1==pClass2);
            System.out.println(pClass1==pClass3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 03、获取类对象、会导致静态属性被初始化，而且只会执行一次
     *      Class hero = Hero.class除外
     */
    private static void test02() {
        String className = "com.how2.t01ldx.Hero";
        try {
            Class pClass1=Class.forName(className);
            Class pClass2=Hero.class;
            Class pClass3=new Hero().getClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
