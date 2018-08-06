package git.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuchen25 on 2018/3/1.
 */
@RestController
@RequestMapping("fund")
public class FundController {

    @RequestMapping("what")
    public String what(){
        return "What's the fuck";
    }
}
