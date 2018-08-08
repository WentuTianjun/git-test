package git.test.controller;

import git.test.aop.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/getName")
    @ResponseBody
    public String getName(String id) {
        return "小王";
    }

    @RequestMapping("/test")
    @ResponseBody
    public void test(String name) {
        person.sayMyName(name);
        System.out.println(person.getClass());
    }
}
