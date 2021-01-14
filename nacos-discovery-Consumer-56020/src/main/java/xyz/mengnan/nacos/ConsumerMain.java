package xyz.mengnan.nacos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// 开启服务发现
@EnableFeignClients
// 开启服务调用
@EnableDiscoveryClient
public class ConsumerMain {
  public static void main(String[] args) {
    SpringApplication.run(ConsumerMain.class, args);
  }
}
