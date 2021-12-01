package com.how2.t03gfield;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * 访问属性
 */
public class Demo {
    public static void main(String[] args) {
        //test01();
        //pra01();
        par02();
    }

    private static void test01() {
        Hero h =new Hero();
        //使用传统方式修改name的值为garen
        h.name = "亚瑟";
        try {
            //获取类Hero的名字叫做name的字段
            Field f1= h.getClass().getDeclaredField("name");
            //修改这个字段的值
            f1.set(h, "不知火舞");
            System.out.println(h.name);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void pra01() {
        Hero h = new Hero();
        h.setName("萧玄");

        try {
            Field name = h.getClass().getDeclaredField("name");
            name.set(h,"萧炎");
            System.out.println("h.getName() = " + h.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * getFields 只能获取public的字段，自身和父类继承的
     *
     * getDeclaredFields 只能获取自身所有的，关于private字段，需要加setAccessible(true)才能访问
     */
    private static void par02() {
        DQHero dqHero = new DQHero();
        dqHero.setName("萧炎");
        dqHero.setLevel("八星巅峰斗尊");
        dqHero.addGf("八极崩");
        dqHero.addGf("雷动三千");
        dqHero.addGf("天火三玄变");

        System.out.println("dqHero = " + dqHero);

        /*Field[] fields = dqHero.getClass().getFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getName());
        }

        System.out.println("==================" );

        Field[] declaredFields = dqHero.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("field = " + field.getName());
        }*/

        try {
            Field gfs = dqHero.getClass().getDeclaredField("gfs");
            ArrayList<String> ls = new ArrayList<>();
            ls.add("琉璃金身");
            ls.add("天大造化掌");
            //ava.lang.IllegalAccessException
            gfs.setAccessible(true);
            gfs.set(dqHero,ls);

            System.out.println("dqHero.getGfs() = " + dqHero.getGfs());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
