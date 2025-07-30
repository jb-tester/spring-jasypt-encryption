package com.mytests.spring.springjasyptencryption;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringJasyptEncryptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJasyptEncryptionApplication.class, args);
    }

        @Bean
            public CommandLineRunner commandLineRunner(BarService barService) {
                return args -> {
                    System.out.println("--------------------------------------");
                    barService.getAll().forEach(System.out::println);
                    System.out.println("--------------------------------------");
                };
            }
}
