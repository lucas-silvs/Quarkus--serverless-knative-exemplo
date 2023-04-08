package com.lucassilvs.serverless.exemplo.gateway.usuario;

import com.lucassilvs.serverless.exemplo.gateway.entity.UsuarioEntity;
import com.lucassilvs.serverless.exemplo.gateway.repository.UsuarioRepository;
import com.lucassilvs.serverless.exemplo.models.usuario.request.UsuarioAjusteTelefoneRequest;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import java.util.Optional;


@ApplicationScoped
public class UsuarioGatewayimpl implements UsuarioGateway {
    @Inject
    private UsuarioRepository usuarioRepository;

    public UsuarioEntity buscarUsuarioPorCpf(String cpf) {
        return Optional.ofNullable(usuarioRepository.buscarPeloCpfCnpj(cpf)).orElseThrow(NotFoundException::new);
    }

    @Override
    public void atualizarTelefoneUsuario(UsuarioAjusteTelefoneRequest request) {
        usuarioRepository.atualizarTelefonePorCpf(request.getCpf(), request.getTelefone());
    }
}
