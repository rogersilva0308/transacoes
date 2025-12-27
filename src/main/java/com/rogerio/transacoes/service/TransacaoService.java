package com.rogerio.transacoes.service;

import com.rogerio.transacoes.domain.Transacao;
import com.rogerio.transacoes.dto.TransacaoRequest;
import com.rogerio.transacoes.service.validacoes.Validacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {

    private final List<Transacao> transacoes = new ArrayList<>();

    private final List<Validacao> validacoes = new ArrayList<>();

    public TransacaoService(List<Validacao> validacoes) {
        this.validacoes.addAll(validacoes);
    }

    public void salvar(TransacaoRequest request) {

        validacoes.forEach(validacao -> validacao.validar(request));

        transacoes.add(new Transacao(request.valor(), request.dataHora()));
    }
}
