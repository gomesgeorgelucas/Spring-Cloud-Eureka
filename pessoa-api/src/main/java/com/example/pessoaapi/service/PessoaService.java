package com.example.pessoaapi.service;

import com.example.pessoaapi.client.BancoClient;
import com.example.pessoaapi.client.EnderecoClient;
import com.example.pessoaapi.dto.PessoaDTO;
import com.example.pessoaapi.model.Banco;
import com.example.pessoaapi.model.Endereco;
import com.example.pessoaapi.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private BancoClient bancoClient;

    @Autowired
    private EnderecoClient enderecoClient;


    public Pessoa savePessoa(PessoaDTO pessoaDTO) {
        Pessoa pessoa = new Pessoa();

        pessoa.setEmail(pessoaDTO.getEmail());
        pessoa.setName(pessoaDTO.getName());

        //Buscar o CEP
        Endereco enderecoByCode = enderecoClient.getEnderecoByCep(pessoaDTO.getCep());
        if (enderecoByCode != null) {
            pessoa.setBairro(enderecoByCode.getBairro());
            pessoa.setCep(enderecoByCode.getCep());
            pessoa.setLogradouro(enderecoByCode.getLogradouro());
            pessoa.setUf(enderecoByCode.getUf());
        }
        //Buscar o Banco
        Banco bancoByCode = bancoClient.getBancoByCode(pessoaDTO.getCodigoBanco());
        if (bancoByCode != null) {
            pessoa.setNomeBanco(bancoByCode.getName());
        }

        return pessoa;
    }

}
