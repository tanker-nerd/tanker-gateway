package org.dbpedia.spotlight;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.integration.annotation.IntegrationComponentScan;


@EnableZuulProxy
@SpringBootApplication
@EnableAutoConfiguration
@SuppressWarnings("checkstyle:hideutilityclassconstructor")
public class Gateway {
    public static void main(String[] args) {
        SpringApplication.run(Gateway.class, args);
    }
}
