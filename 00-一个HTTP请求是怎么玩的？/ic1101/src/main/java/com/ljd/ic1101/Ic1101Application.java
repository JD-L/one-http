package com.ljd.ic1101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Ic1101Application {

    public static void main(String[] args) {
        SpringApplication.run(Ic1101Application.class, args);
    }

}
