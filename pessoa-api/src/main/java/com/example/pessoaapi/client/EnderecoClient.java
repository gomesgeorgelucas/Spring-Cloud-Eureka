package com.example.pessoaapi.client;

import com.example.pessoaapi.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "enderecos")
public interface EnderecoClient {
    @GetMapping("/enderecos/{cep}")
    Endereco getEnderecoByCep(@PathVariable String cep);
}
