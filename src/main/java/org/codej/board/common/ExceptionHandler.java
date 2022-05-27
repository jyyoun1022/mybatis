package org.codej.board.common;

import lombok.extern.log4j.Log4j2;
import org.mybatis.logging.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Log4j2
@RequestMapping("/error")
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public void defaultExceptionHandler(HttpServletRequest request,
                                        Exception e,
                                        Model model){
        model.addAttribute("exception",e);
        log.error("exception",e);


    }
}
