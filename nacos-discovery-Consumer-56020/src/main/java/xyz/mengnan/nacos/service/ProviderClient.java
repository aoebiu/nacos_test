package xyz.mengnan.nacos.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("quickstart-provider")
@Service
public interface ProviderClient {
  @GetMapping("/service")
  String service();
}
