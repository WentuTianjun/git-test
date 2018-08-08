package git.test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceTest {

    @Pointcut("@annotation(git.test.aop.Timer)")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(){
        System.out.println("Spring aop before");
    }
}
