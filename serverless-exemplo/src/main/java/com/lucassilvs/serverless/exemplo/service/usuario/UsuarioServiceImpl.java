package com.lucassilvs.serverless.exemplo.service.usuario;

import com.lucassilvs.serverless.exemplo.gateway.usuario.UsuarioGatewayimpl;
import com.lucassilvs.serverless.exemplo.models.usuario.request.UsuarioAjusteTelefoneRequest;
import com.lucassilvs.serverless.exemplo.models.usuario.response.UsuarioContractResponse;
import io.quarkus.funqy.Funq;
import io.quarkus.logging.Log;

import javax.inject.Inject;
import java.util.Map;


public class UsuarioServiceImpl implements UsuarioService {

    @Inject
    private UsuarioGatewayimpl usuarioGatewayimpl;


    // utilizando Query parameter, onde os parámetros são mapeados em uma Map
    @Funq("usuario")
    public UsuarioContractResponse buscarUsuarioPeloCpf(Map<String, String> paramCPF) {
        try {
            return new UsuarioContractResponse(usuarioGatewayimpl.buscarUsuarioPorCpf(paramCPF.get("cpf")));
        } catch (RuntimeException e) {
            Log.info(String.format("Ocorreu algum erro ao tentar buscar o usuario: %s", e.getMessage()), e);
            throw e;
        }
    }

    // função para alterar telefone, enviando uma request com o ContentType Json
    @Funq("usuario/telefone")
    public void alterarTelefoneUsuario(UsuarioAjusteTelefoneRequest usuarioRequest) {
        try {
            usuarioGatewayimpl.atualizarTelefoneUsuario(usuarioRequest);
        } catch (RuntimeException e) {
            Log.info(String.format("Ocorreu algum erro ao tentar buscar o usuario: %s", e.getMessage()), e);
            throw e;
        }
    }
}
