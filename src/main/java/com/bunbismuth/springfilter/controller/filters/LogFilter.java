package com.bunbismuth.springfilter.controller.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

@WebFilter(urlPatterns = "/*", filterName = "LogFilter")
@Order(1)
public class LogFilter implements Filter {

  private static final Logger LOGGER = LoggerFactory.getLogger(LogFilter.class);

  @Override
  public void init(FilterConfig filterConfig) {
    LOGGER.info("Inicializando o LoggingFilter");
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response,
      FilterChain filterChain) throws IOException, ServletException {
    LOGGER.info("Passou pelo LoggingFilter");

    filterChain.doFilter(request, response);
  }

  @Override
  public void destroy() {
    LOGGER.info("Desativando o LoggingFilter");
  }
}
