package com.hyperbench.hyperbench.springboot;

//import com.spring4all.swagger.EnableSwagger2Doc;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
public class HyperbenchSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HyperbenchSpringbootApplication.class, args);
    }

}
