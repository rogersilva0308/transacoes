package com.rogerio.transacoes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

//    @ExceptionHandler(FormularioInvalidoException.class)
//    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
//    public void FormularioInvalidoException(FormularioInvalidoException e){
//        System.out.println(e.getMessage());
//    }

    @ExceptionHandler(FormularioInvalidoException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public String FormularioInvalidoException(FormularioInvalidoException e){
        return e.getMessage();
    }
}
