package com.hongshu.common.annotation.AuthorityVerify;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义权限校验接口
 *
 * @Author
 * @date
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthorityVerify {

    String value() default "";
}
