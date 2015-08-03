package com.example.bajian.restfulokhttprxjavagson.client;

/**
 * Created by LC on 2015/6/3.
 */
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于Gson命名策略的注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ParamName {

    String value();
}
