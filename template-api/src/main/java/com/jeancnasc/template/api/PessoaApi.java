package com.jeancnasc.template.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "template", url = "${microservices.template.url}")
@RequestMapping("/pessoa")
public interface PessoaApi {
    @GetMapping("/{id}")
    PessoaDto recuperar(@PathVariable("id") Long id);
}
