package com.rogerio.transacoes.service.validacoes;

import com.rogerio.transacoes.dto.TransacaoRequest;

public interface Validacao {

    void validar(TransacaoRequest request);
}
