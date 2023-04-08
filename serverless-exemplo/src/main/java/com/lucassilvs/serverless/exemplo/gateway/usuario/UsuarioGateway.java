package com.lucassilvs.serverless.exemplo.gateway.usuario;

import com.lucassilvs.serverless.exemplo.gateway.entity.UsuarioEntity;
import com.lucassilvs.serverless.exemplo.models.usuario.request.UsuarioAjusteTelefoneRequest;

public interface UsuarioGateway {

    UsuarioEntity buscarUsuarioPorCpf(String cpf);

    void atualizarTelefoneUsuario(UsuarioAjusteTelefoneRequest request);


}
