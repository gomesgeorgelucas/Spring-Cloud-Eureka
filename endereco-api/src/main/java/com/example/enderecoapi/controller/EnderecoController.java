package com.example.enderecoapi.controller;

import com.example.enderecoapi.client.EnderecoClient;
import com.example.enderecoapi.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/enderecos")
@RestController
public class EnderecoController {

    @Autowired
    private EnderecoClient enderecoClient;

    @GetMapping("/{cep}")
    public Endereco getEnderecoById(@PathVariable String cep) {
        return enderecoClient.getEndereco(cep);
    }
}
