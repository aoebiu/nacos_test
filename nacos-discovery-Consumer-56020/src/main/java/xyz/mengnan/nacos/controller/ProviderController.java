package xyz.mengnan.nacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.mengnan.nacos.service.ProviderClient;

@RestController
public class ProviderController {

  @Autowired
  private ProviderClient providerClient;

  @GetMapping("/service")
  public String service() {
    String service = providerClient.service();
    return "consumer invoke: "+service;
  }
}
