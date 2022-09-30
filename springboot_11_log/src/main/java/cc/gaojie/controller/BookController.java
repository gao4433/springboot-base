package cc.gaojie.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@Slf4j
@RestController
@RequestMapping("/books")
public class BookController{

    @GetMapping
    public String getById(){
        System.out.println("springboot is running......");

        log.debug("debug……");
        log.info("debug……");
        log.warn("debug……");
        log.error("debug……");

        return "springboot is running......";
    }
}
