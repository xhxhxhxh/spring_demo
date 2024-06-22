package com.test.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[]{SpringConfig.class};
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[]{SpringMvcConfig.class};
  }

  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }

  // post请求中文问题
  @Override
  protected Filter[] getServletFilters() {
    CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter("UTF-8", true);
    return new Filter[]{characterEncodingFilter};
  }
}

//public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
//  @Override
//  protected WebApplicationContext createServletApplicationContext() {
//    AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
//    annotationConfigWebApplicationContext.register(SpringMvcConfig.class);
//    return annotationConfigWebApplicationContext;
//  }
//
//  @Override
//  protected String[] getServletMappings() {
//    return new String[]{"/"};
//  }
//
//  @Override
//  protected WebApplicationContext createRootApplicationContext() {
//    AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
//    annotationConfigWebApplicationContext.register(SpringConfig.class);
//    return annotationConfigWebApplicationContext;
//  }
//}
