package com.how2.pra01;

import com.how2.t03gfield.DQHero;
import com.how2.t03gfield.Hero;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
/**
 * 类对象
 *  获取类信息（属性、方法等）、三种获取方式，静态代码快加载情况
 *
 *  通过类对象-创建对象
 *  访问属性
 *  方法调用
 *
 *  应用
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        //对象类 类对象
        Class<DQHero> dqHeroClass = DQHero.class;
        Class<?> aClass = Class.forName("com.how2.t03gfield.DQHero");
        Class<? extends DQHero> aClass1 = new DQHero().getClass();

        System.out.println("(dqHeroClass==aClass) = " + (dqHeroClass==aClass));
        System.out.println("(dqHeroClass==aClass1) = " + (dqHeroClass == aClass1));

        //类对象 创建对象
        DQHero xy = dqHeroClass.getConstructor().newInstance();
        xy.setName("萧炎");

        //访问属性
        Field level = dqHeroClass.getField("level");
        level.set(xy,"八星斗尊");
        System.out.println("xy = " + xy);

        //方法调用
        Method addGf = dqHeroClass.getMethod("addGf", String.class);
        //wrong number of arguments
        //addGf.invoke(xy,"八极崩","焚炎决","毁灭火莲");
        addGf.invoke(xy,"八极崩");
        addGf.invoke(xy,"毁灭火莲");
        System.out.println("xy = " + xy);

        //成帝
        InputStream stream = ClassLoader.getSystemResourceAsStream("gf.config");
        Properties properties = new Properties();
        //properties.load(stream);
        //中文乱码
        properties.load(new InputStreamReader(stream,"UTF-8"));

        String pGfs = properties.get("param.gfs").toString();
        String mSetGfs = properties.get("method.studyWay").toString();
        //no such method because of param.class
        Method setGfs = dqHeroClass.getDeclaredMethod(mSetGfs, List.class);
        ArrayList<String> gfs = new ArrayList<>();
        gfs.add(pGfs);

        setGfs.invoke(xy,gfs);
        xy.setLevel("斗帝");
        System.out.println("xy = " + xy);
    }
}
