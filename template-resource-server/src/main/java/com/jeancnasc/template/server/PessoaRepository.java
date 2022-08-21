package com.jeancnasc.template.server;

import com.jeancnasc.template.api.PessoaDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("db")
public class PessoaRepository {

    public PessoaDto recuperar(Long id) {
        PessoaDto p = new PessoaDto();
        p.setId(id);
        p.setNome("Nome " + id);
        return p;
    }
}
