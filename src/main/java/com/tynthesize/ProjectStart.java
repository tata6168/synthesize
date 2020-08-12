package com.tynthesize;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.synthesize.**.mapper")
public class ProjectStart {
    public static void main(String[] args) {
        SpringApplication.run(ProjectStart.class,args);
    }
}
