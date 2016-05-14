package com.myapp.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by KL on 2016/5/13.
 */
public class MyServletInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        //regist myservlet
        ServletRegistration.Dynamic myServlet = servletContext.addServlet("myServlet", MyServlet.class);
        myServlet.addMapping("/custom/**");
        myServlet.setMultipartConfig(
                new MultipartConfigElement("E:\\code\\Java\\spring_in_action_toy_code\\SpringMVC\\web\\resources\\images"));
        //regist filter
        javax.servlet.FilterRegistration.Dynamic filter =
                servletContext.addFilter("myFilter", MyFilter.class);
        filter.addMappingForUrlPatterns(null, false, "/cutom/*");

    }
}
