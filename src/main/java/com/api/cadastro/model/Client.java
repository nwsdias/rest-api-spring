package com.api.cadastro.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tb_client")
public class Client {

    @Id
    @Column(nullable = false, length = 11)
    private String cpf;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, length = 8)
    private String cep;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String bairro;
    @Column(nullable = false, length = 20)
    private int numero;
    @Column(nullable = false, length = 15)
    private String telefone;
    @Column(nullable = false)
    private String email;
}
