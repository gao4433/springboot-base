package cc.gaojie.controller;

import cc.gaojie.bean.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaojie  gao4433@qq.com
 * @Description
 * @date 2022/9/15 18:42
 * @since 1.8
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${lesson}")
    private String lesson;

    @Value("${enterprise.name}")
    private String name;

    @Value("${enterprise.subject[0]}")
    private String subject0;

    //使用自动装配封装所有的数据到一个对象中
    @Autowired
    private Environment env;

    @Autowired
    private Enterprise enterprise;


    @GetMapping
    public String getById() {
        System.out.println("springboot is running......");
        System.out.println(lesson);
        System.out.println(name);
        System.out.println(subject0);
        System.out.println(env.getProperty("enterprise.subject[1]}"));
        System.out.println(enterprise);
        return "springboot is running......";
    }
}
