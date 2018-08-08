package git.test.aop;

import org.springframework.stereotype.Component;

@Component
public class Hisenberg implements Person {

    @Timer
    @Override
    public String sayMyName(String myName) {
        System.out.println("-- sayHello() --");
        return "You are " + myName;
    }
}
