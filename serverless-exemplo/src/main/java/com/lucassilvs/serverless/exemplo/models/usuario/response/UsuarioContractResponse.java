package com.lucassilvs.serverless.exemplo.models.usuario.response;

import com.lucassilvs.serverless.exemplo.gateway.entity.UsuarioEntity;

import java.util.Date;

public class UsuarioContractResponse {

    private String id;
    private String login;
    private String nome;
    private String email;
    private String cpf;
    private Date dataNascimento;
    private String telefone;

    public UsuarioContractResponse(UsuarioEntity entity) {
        this.setNome(entity.getNome());
        this.setEmail(entity.getEmail());
        this.setCpf(entity.getCpf());
        this.setDataNascimento(entity.getDataNascimento());
        this.setLogin(entity.getLogin());
        this.setId(String.valueOf(entity.getId()));
        this.setTelefone(entity.getTelefone());
    }

    public UsuarioContractResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
