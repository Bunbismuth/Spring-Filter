package com.bunbismuth.springfilter.controller.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

@WebFilter(urlPatterns = "/usuarios", filterName = "UserFilter")
@Order(2)
public class UserFilter implements Filter {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserFilter.class);

  @Override
  public void init(FilterConfig filterConfig) {
    LOGGER.info("Inicializando o UserFilter");
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response,
      FilterChain filterChain) throws IOException, ServletException {

    LOGGER.info("Passou pelo UserFilter");

    HttpServletRequest req = (HttpServletRequest) request;
    if (req.getMethod().equals("GET")) {
      filterChain.doFilter(request, response);
    } else {
      LOGGER.error("Requisição interrompida");
      ((HttpServletResponse) response).setStatus(500);
      response.getOutputStream().write("Você não tem permissão para cadastrar usuarios".getBytes());
    }
  }

  @Override
  public void destroy() {
    LOGGER.info("Desativando o UserFilter");
  }
}
