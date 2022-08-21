package com.jeancnasc.template.server;

import com.jeancnasc.template.api.PessoaApi;
import com.jeancnasc.template.api.PessoaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController implements PessoaApi {

    @Autowired
    @Qualifier("db")
    private PessoaRepository pessoaRepository;


    @Override
    public PessoaDto recuperar( Long id) {
        return pessoaRepository.recuperar(id);
    }
}
