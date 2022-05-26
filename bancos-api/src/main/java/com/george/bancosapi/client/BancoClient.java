package com.george.bancosapi.client;

import com.george.bancosapi.model.Banco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://brasilapi.com.br/api/banks/v1", name = "brasilapi")
public interface BancoClient {

    @GetMapping("/{code}")
    Banco getBanco(@PathVariable Long code);
}
