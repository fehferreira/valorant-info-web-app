package br.com.internet.vava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ValorantApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValorantApplication.class, args);
    }

}
