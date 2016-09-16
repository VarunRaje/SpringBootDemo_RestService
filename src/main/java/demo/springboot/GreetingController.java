package demo.springboot;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class GreetingController {

    @Resource
    public Addition addition;


    @RequestMapping(method= RequestMethod.GET, path = "/greeting")
    public String greeting() {
        int a = addition.add(4,5);
        return   "Hello World" +a ;

    }

}