package com.example.pessoaapi.client;

import com.example.pessoaapi.model.Banco;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="bancos")
public interface BancoClient {
    @GetMapping("/bancos/{code}")
    @CircuitBreaker(name = "servico")
    Banco getBancoByCode(@PathVariable Long code);
}
