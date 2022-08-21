package com.jeancnasc.template.api;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;

@EnableFeignClients(clients = PessoaApi.class)
@PropertySource("classpath:microservices.properties")
public class ClientConfig {
}
