package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by KL on 2016/4/2.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * the @Configuration classes returned will define beans for ContextLoaderListener's context
     * @return
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class};
    }

    /**
     * the @Configuration classes returned will define beans for DispatcherServlet's application context
     * @return
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    /**
     * identify one or more paths DispatcherServlet will be mapped to
     * @return
     */
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
