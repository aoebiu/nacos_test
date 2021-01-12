package xyz.mengnan.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Service2Bootstrap {
  public static void main(String[] args) {
    SpringApplication.run(Service2Bootstrap.class, args);
  }
  @Value("${common.name}")
  private String config;

  @GetMapping("/config")
  public String getConfig() {
    return config;
  }
}
