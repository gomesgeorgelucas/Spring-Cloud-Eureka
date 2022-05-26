package com.example.pessoaapi.dto;

import lombok.Data;

@Data
public class PessoaDTO {
    private String name;
    private String email;
    private Long codigoBanco;
    private String cep;
}
