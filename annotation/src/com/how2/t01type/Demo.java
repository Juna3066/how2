package com.how2.t01type;

/**
 *
 * （1）5内置注解
 *          @Override
 *          @Deprecated
 *          @SuppressWarnings
 *          @SafeVarargs    当使用可变数量的参数的时候，而参数的类型又是泛型T的话(1.7 之后)
 *          @FunctionalInterface    (1.8 新增的注解，用于约定函数式接口)
 *
 * （2）元注解
 *          @Target
                 * ElementType.TYPE：能修饰类、接口或枚举类型
                 * ElementType.FIELD：能修饰成员变量
                 * ElementType.METHOD：能修饰方法
                 * ElementType.PARAMETER：能修饰参数
                 * ElementType.CONSTRUCTOR：能修饰构造器
                 * ElementType.LOCAL_VARIABLE：能修饰局部变量
                 * ElementType.ANNOTATION_TYPE：能修饰注解
                 * ElementType.PACKAGE：能修饰包
 *          @Retention
                 * RetentionPolicy.SOURCE： 注解在源码中
                 * RetentionPolicy.CLASS： 注解在源码、class文件中；@Retention的默认值
                 * RetentionPolicy.RUNTIME： 注解在源码、class文件、以及运行后仍然存在，用来反射获取相关信息
 *          @Inherited
 *          @Repeatable (java1.8 新增)
 *          @Documented 生成的javaDoc文件 说明注解
 *
 * （3）自定义注解
 *
 * 案例
 *      反射解析注解中的参数，仿照实现矿界注解的作用
 */
public class Demo {
    public static void main(String[] args) {

    }
}
