package com.rogerio.transacoes.service.validacoes.impl;

import com.rogerio.transacoes.dto.TransacaoRequest;
import com.rogerio.transacoes.exception.FormularioInvalidoException;
import com.rogerio.transacoes.service.validacoes.Validacao;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class ValidaDataHoraImpl implements Validacao {

    @Override
    public void validar(TransacaoRequest request) {
        boolean ehDepois = request.dataHora().isAfter(OffsetDateTime.now());

        if (ehDepois) {
            throw new FormularioInvalidoException("DataHora não deve ser posterior a data atual");
        }
    }
}
