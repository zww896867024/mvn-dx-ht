//package com.gu.admin;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import tk.mybatis.spring.annotation.MapperScan;
//
//@SpringBootApplication
//@ComponentScan(basePackages = {"com.gu.admin", "com.gu.common", "com.gu.shirojwt"})
//@MapperScan(basePackages = {"com.gu.common.mapper", "com.gu.admin.mapper"})
//@EnableScheduling
//public class AdminApp extends SpringBootServletInitializer {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(AdminApp.class);
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(AdminApp.class, args);
//    }
//}
