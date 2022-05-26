package com.example.pessoaapi.model;

import lombok.Data;

@Data
public class Pessoa {
    private String name;
    private String email;

    private Long code;
    private  String ispb;
    private String nomeBanco;
    private  String fullName;

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private  String localidade;
    private String uf;
    private String ddd;
}
