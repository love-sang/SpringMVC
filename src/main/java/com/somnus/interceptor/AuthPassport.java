package com.somnus.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @class:AuthPassport
 * @descript:自定义注解，带有这个注解的方法 会被拦截器拦截
 * @date:2016年10月24日 下午4:51:51
 * @author san
 * @version:V1.0
 */
@Target(ElementType.METHOD)  
@Retention(RetentionPolicy.RUNTIME) 
public @interface AuthPassport {
    boolean validate() default true;
}
