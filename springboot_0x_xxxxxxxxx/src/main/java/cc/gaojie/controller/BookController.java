package cc.gaojie.controller;

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

    @GetMapping
    public String getById(){
        System.out.println("springboot is running......");
        return "springboot is running......";
    }
}
