package SpringTasks.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* SpringTasks.beans.User.returnFullName(String)) && args(flag)")
    public void newjob(String flag) {
    }


    @Around(value = "newjob(flag)")

    public String aroundJob(ProceedingJoinPoint joinPoint, String flag) throws Throwable {

        System.out.println("BEFORE JOB");
        String result = (String) joinPoint.proceed();
        System.out.println("After JOB");
        if (flag.equals("disable")) return "!!!";
        return result + "!!!";
    }
}


