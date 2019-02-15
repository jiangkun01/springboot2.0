package com.wechat.joker.login.web;

import java.lang.annotation.*;

/**
 * @author joker
 * @date 2019/2/13 16:35
 */
@Target({ElementType.METHOD, ElementType.TYPE}) //  作用域
@Retention(RetentionPolicy.RUNTIME) //  级别
@Documented // 文档
public @interface MyFirstAnnotation {
    String value() default "";
}
