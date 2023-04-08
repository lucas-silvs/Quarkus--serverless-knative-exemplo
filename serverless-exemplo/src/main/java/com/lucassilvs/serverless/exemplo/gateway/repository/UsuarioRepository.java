package com.lucassilvs.serverless.exemplo.gateway.repository;


import com.lucassilvs.serverless.exemplo.gateway.entity.UsuarioEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped


public class UsuarioRepository implements PanacheRepository<UsuarioEntity> {

    @Inject
    EntityManager em;

    public UsuarioEntity buscarPeloCpfCnpj(String cpf) {
        return find("cpf", cpf).firstResult();
    }


    @Transactional
    public void atualizarTelefonePorCpf(String cpf, String telefone) {
        update("update UsuarioEntity u set u.telefone = :telefone where u.cpf = :cpf", Parameters.with("telefone", telefone).and("cpf", cpf));
    }

}
