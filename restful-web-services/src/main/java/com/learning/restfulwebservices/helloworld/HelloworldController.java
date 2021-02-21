package com.learning.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class HelloworldController {

    // @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "hello")
    public String helloWorld() {
        return "Hello World";
    }
    

    @GetMapping(path="/hello_bean")
    public HelloWorldBean helloWorldBean(String name) {
        return new HelloWorldBean("Hello Bean");
    }

    @GetMapping(path="/hello_bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanWithParm(@PathVariable String name) {
        return new HelloWorldBean(String.format("Welcome %s", name));
    }
}
