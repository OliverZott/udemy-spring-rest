package org.springdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Spring MVC provides a dispatcher servlet which receives incoming requests and routes them to appropriate controllers.
 */
public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * NO Root-Config class in this project, ONLY Servlet-Config classes
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // return new Class[0];
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{DemoAppConfig.class};
    }

    /**
     * Tells the container the route for all requests
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
