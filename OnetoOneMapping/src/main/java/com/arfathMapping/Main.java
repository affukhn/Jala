package com.arfathMapping;


import com.mySqlWork.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mySqlWork","com.arfathMapping"})
@EnableJpaRepositories(basePackages = "com.mySqlWork")
@EntityScan("com.mySqlWork")
public class Main implements  CommandLineRunner{
    @Autowired
    private Myservice myservice;

    @Autowired
    WebApplicationContext container;


    public static void main(String[] args) {


        SpringApplication str=new SpringApplication(Main.class);
        str.run();



    }

    @Override
    public void run(String... args) throws Exception {

//        myservice.save();
//        myservice.fetch();
//        myservice.getStudentFromAddress();

    }


}