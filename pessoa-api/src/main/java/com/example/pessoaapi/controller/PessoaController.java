package com.example.pessoaapi.controller;

import com.example.pessoaapi.dto.PessoaDTO;
import com.example.pessoaapi.model.Pessoa;
import com.example.pessoaapi.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pessoa")
@RestController
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @PostMapping()
    public Pessoa savePessoa(@RequestBody PessoaDTO pessoaDTO) {
        return pessoaService.savePessoa(pessoaDTO);
    }


}
