package me.whiteship;

import java.lang.annotation.*;

/**
 * Created by jojoldu@gmail.com on 2020-11-01
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.TYPE,ElementType.FIELD})
@Inherited
public @interface MyAnnotation {
     String name() default "keesun";
     int number() default 100;
}
