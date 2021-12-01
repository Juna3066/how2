package com.how2.t05;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class UseIt {
    public static void main(String[] args) {
        //new Service1().read();
        //new Service2().listenMS();

        InputStream stream = ClassLoader.getSystemResourceAsStream("application.properties");
        try {
            Properties properties = new Properties();
            properties.load(stream);
            String className = properties.get("className").toString();
            String method = properties.get("method").toString();

            Class<?> aClass = Class.forName(className);
            Object instance = aClass.getConstructor().newInstance();
            Method m = aClass.getDeclaredMethod(method);

            m.invoke(instance);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
