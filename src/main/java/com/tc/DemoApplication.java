package com.tc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@MapperScan("com.tc.dao")
public class DemoApplication {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(DemoApplication.class, args);
        InetAddress ip4 = Inet4Address.getLocalHost();
        System.out.println("swagger:http://"+ip4.getHostAddress()+":8080/swagger-ui.html");
    }

}
