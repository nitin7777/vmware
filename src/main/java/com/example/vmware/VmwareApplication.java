package com.example.vmware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class VmwareApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(VmwareApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "9091"));
        app.run(args);
    }

}
