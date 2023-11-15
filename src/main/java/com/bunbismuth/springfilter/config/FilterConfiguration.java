package com.bunbismuth.springfilter.config;

import com.bunbismuth.springfilter.controller.filters.LogFilter;
import com.bunbismuth.springfilter.controller.filters.UserFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {
/*
  @Bean
  public FilterRegistrationBean<LogFilter> loggingFilterRegistrationBean() {
    FilterRegistrationBean<LogFilter> register =
        new FilterRegistrationBean<>();
    LogFilter userFilter = new LogFilter();

    register.setFilter(userFilter);
    register.addUrlPatterns("/usuarios", "/pedidos");
    register.setOrder(1);

    return register;
  }

  @Bean
  public FilterRegistrationBean<UserFilter> userFilterRegistrationBean() {
    FilterRegistrationBean<UserFilter> register =
        new FilterRegistrationBean<>();
    UserFilter userFilter = new UserFilter();

    register.setFilter(userFilter);
    register.addUrlPatterns("/usuarios");
    register.setOrder(2);

    return register;
  }
*/
}
