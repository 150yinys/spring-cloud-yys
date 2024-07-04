package yys.common.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD}) //作用在类、方法上
@Retention(RetentionPolicy.RUNTIME) //由JVM 加载，包含在类文件中，在运行时可以被获取到
@Documented //表明该注解标记的元素可以被Javadoc 或类似的工具文档化
public @interface AnnotationTest {
    String value() default "";
}
