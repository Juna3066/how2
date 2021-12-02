package com.how2.t03mdefine;

import jdk.nashorn.internal.ir.ReturnNode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtilChild extends ADBUtil {

    public static Connection getConnection2() throws SQLException, NoSuchMethodException, SecurityException {
        JDBCConfig config = DBUtilChild.class.getAnnotation(JDBCConfig.class);
        String ip = config.ip();
        int port = config.port();
        String database = config.database();
        String encoding = config.encoding();
        String loginName = config.loginName();
        String password = config.password();

        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip, port, database, encoding);
        System.out.println("url = " + url);
        return null;
        //return DriverManager.getConnection(url, loginName, password);
    }

    public static void main(String[] args) throws SQLException, NoSuchMethodException {
        Connection c = getConnection2();
        System.out.println(c);
    }
}
