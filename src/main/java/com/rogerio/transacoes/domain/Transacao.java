package com.rogerio.transacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
public class Transacao {

    private Double valor;
    private OffsetDateTime dataHora;
}
