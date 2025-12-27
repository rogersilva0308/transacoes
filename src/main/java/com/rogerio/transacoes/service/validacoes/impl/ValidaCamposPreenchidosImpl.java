package com.rogerio.transacoes.service.validacoes.impl;

import com.rogerio.transacoes.dto.TransacaoRequest;
import com.rogerio.transacoes.exception.FormularioInvalidoException;
import com.rogerio.transacoes.service.validacoes.Validacao;
import org.springframework.stereotype.Component;

@Component
public class ValidaCamposPreenchidosImpl implements Validacao {

    @Override
    public void validar(TransacaoRequest request) {
        if (request.valor() == null || request.dataHora() == null) {
            throw new FormularioInvalidoException("Campos valor e dataHora são obrigatórios");
        }
    }
}
