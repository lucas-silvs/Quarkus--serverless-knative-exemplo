package com.lucassilvs.serverless.exemplo.models.usuario.request;

public class UsuarioAjusteTelefoneRequest {

    private String cpf;

    private String telefone;

    public UsuarioAjusteTelefoneRequest() {
    }

    public UsuarioAjusteTelefoneRequest(String cpf, String telefone) {
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
