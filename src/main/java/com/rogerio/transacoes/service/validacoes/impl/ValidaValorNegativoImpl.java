package com.rogerio.transacoes.service.validacoes.impl;

import com.rogerio.transacoes.dto.TransacaoRequest;
import com.rogerio.transacoes.exception.FormularioInvalidoException;
import com.rogerio.transacoes.service.validacoes.Validacao;
import org.springframework.stereotype.Component;

@Component
public class ValidaValorNegativoImpl implements Validacao {
    @Override
    public void validar(TransacaoRequest request) {
        if (request.valor() < 0) {
            throw new FormularioInvalidoException("Valor não deve ser negativo");
        }
    }
}
