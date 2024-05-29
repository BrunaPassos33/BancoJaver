package com.ibm.www.bancoJaver.Cadastro.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EntityScan(basePackages = "com.ibm.www.bancoJaver.cadastro.model.entity")
public class CadastroApplication {

    public static void main(String[] args) {

        SpringApplication.run(CadastroApplication.class, args);




    }
}
