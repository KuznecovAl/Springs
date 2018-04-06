package SpringTasks.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* SpringTasks.beans.User.getFirstname(..))")
        public void newjob(){

    }


    @Around("newjob()")
    public String beforeJob(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("BEFORE JOB");

        String result = (String) joinPoint.proceed();
        System.out.println(result);
        System.out.println("After JOB");
        return result;
    }
}
