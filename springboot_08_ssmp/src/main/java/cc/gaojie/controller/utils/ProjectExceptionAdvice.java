package cc.gaojie.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author gaojie  gao4433@qq.com
 * @Description
 * @date 2022/9/27 10:15
 * @since 1.8
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler
    public R doException(Exception ex){
        ex.printStackTrace();
        return new R("服务器故障，请稍后再试！");
    }
}
