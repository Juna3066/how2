package com.how2.t03mdefine;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.*;

@Target({METHOD,TYPE})
@Retention(RetentionPolicy.RUNTIME)
//@Inherited
@Documented
public @interface JDBCConfig {
    String ip();
    int port() default 3306;
    String database();
    String encoding();
    String loginName();
    String password();
}
