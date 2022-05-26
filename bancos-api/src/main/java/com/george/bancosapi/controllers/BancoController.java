package com.george.bancosapi.controllers;

import com.george.bancosapi.client.BancoClient;
import com.george.bancosapi.model.Banco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/bancos")
@RestController
public class BancoController {
    @Autowired
    private BancoClient bancoClient;

    @GetMapping("/{id}")
    public Banco getBancoById(@PathVariable Long id) {
        return bancoClient.getBanco(id);
    }
}
