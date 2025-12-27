package com.rogerio.transacoes.controller;

import com.rogerio.transacoes.dto.TransacaoRequest;
import com.rogerio.transacoes.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/transacao")
@RestController
public class TransacaoController {

    @Autowired
    private TransacaoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody TransacaoRequest request) {
        service.salvar(request);
    }

}
