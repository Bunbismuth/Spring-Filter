package com.bunbismuth.springfilter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

  @RequestMapping("/pedidos")
  public String getPedido() {
    LOGGER.info("Pedido 123 cadastrado");
    return "Seu pedido foi cadastrado!";
  }

  @RequestMapping("/usuarios")
  public String getUser() {
    LOGGER.info("Usuario Joao do Arrasta cadastrado");
    return "Bem-vindo Joao do Arrasta";
  }
}
