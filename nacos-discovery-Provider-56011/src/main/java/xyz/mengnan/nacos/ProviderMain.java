package xyz.mengnan.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// 开启服务发现
@EnableDiscoveryClient
// 开启服务调用
@EnableFeignClients
public class ProviderMain {
  public static void main(String[] args) {
    SpringApplication.run(ProviderMain.class, args);
  }
}
