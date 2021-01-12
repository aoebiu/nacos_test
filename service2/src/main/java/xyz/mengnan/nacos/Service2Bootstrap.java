package xyz.mengnan.nacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
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

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("/config")
    public String getConfig() {
        return applicationContext.getEnvironment().getProperty("common.name");
    }

    @GetMapping("/config2")
    public String getConfig2() {
        String age = applicationContext.getEnvironment().getProperty("common.age");
        String boy = applicationContext.getEnvironment().getProperty("common.boy");
        String dog = applicationContext.getEnvironment().getProperty("common.dog");
        return age + "---" + boy + "---" + dog;
    }

}
