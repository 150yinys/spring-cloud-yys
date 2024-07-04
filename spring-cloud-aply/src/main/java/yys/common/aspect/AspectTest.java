package yys.common.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectTest {

    private static final Logger log = Logger.getLogger(AspectTest.class);

    /**
     * 下面的表达式解释为：匹配yys.controller.BirdController类中修饰符为public的所有方法
     */
    @Pointcut(value = "execution(public * yys.controller.BirdController.*(..))")
    public void pointCutExecution() {}

    /**
     * target匹配实现BirdService接口的目标对象
     */
    @Pointcut("target(yys.service.BirdService)")
    public void pointcutTarget(){}

    /**
     * target匹配实现BirdService接口的目标对象
     */
    @Pointcut("@annotation(yys.common.annotation.AnnotationTest)")
    public void pointcutAnnotation(){}

    /**
     * 在方法执行之前执行
     * @param joinPoint 参数
     */
    @Before("pointCutExecution()")
    public void pointCutExecutionBefore(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("❤execution匹配调用pointCutExecutionBefore❤");
    }

    /**
     * 在方法执行之后执行
     * @param joinPoint 参数
     */
    @After("pointcutTarget()")
    public void pointcutTargetAfter(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("❤target匹配调用pointcutTargetAfter❤");
    }

    /**
     *  在进入类之前执行，然后返回pjp.proceed()之前执行before，再执行方法体，在到after
     *
     * @param pjp 参数
     */
    @Around("pointcutAnnotation()")
    public Object pointcutAnnotationAround(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        log.info("❤annotation匹配调用pointcutAnnotationAround❤");
        return pjp.proceed();
    }

}
