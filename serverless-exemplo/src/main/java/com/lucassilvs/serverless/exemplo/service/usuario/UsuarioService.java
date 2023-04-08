package com.lucassilvs.serverless.exemplo.service.usuario;

import com.lucassilvs.serverless.exemplo.models.usuario.response.UsuarioContractResponse;

import java.util.Map;

public interface UsuarioService {

    UsuarioContractResponse buscarUsuarioPeloCpf(Map<String, String> paramCPF);
}
