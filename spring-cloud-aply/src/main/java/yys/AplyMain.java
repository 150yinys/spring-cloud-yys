package yys;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan("yys")
public class AplyMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AplyMain.class).web(true).run(args);
    }
}
