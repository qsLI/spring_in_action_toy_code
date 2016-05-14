package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.RequestMapping;
import spittr.Spittle;

import java.util.Date;

/**
 * Created by KL on 2016/5/14.
 */
@Controller
public class ExceptionController {
    @RequestMapping(value = "/test")
    public void test() throws BindException {
        throw new BindException(new Spittle("exception", new Date()), "Spittle");
    }

    @RequestMapping(value = "/test2")
    public void test2() throws Exception {
        throw new SpittleNotFoundException();
    }

    @RequestMapping(value = "/testDuplicate")
    public void testDuplicate() throws Exception {
        throw new DuplicateSpittleException();
    }

//    @ExceptionHandler(DuplicateSpittleException.class)
//    public ModelAndView handleDuplicateSpittle() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("error", "Spittle is duplicate!");
//        modelAndView.setViewName("error/duplicate");
//        return modelAndView;
//    }
}
