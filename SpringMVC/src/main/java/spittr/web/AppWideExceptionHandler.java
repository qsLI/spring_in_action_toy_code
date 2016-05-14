package spittr.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by KL on 2016/5/14.
 */
@ControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(DuplicateSpittleException.class)
    public ModelAndView handleDuplicateSpittle() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error", "Spittle is duplicate!");
        modelAndView.setViewName("error/duplicate");
        return modelAndView;
    }
}
