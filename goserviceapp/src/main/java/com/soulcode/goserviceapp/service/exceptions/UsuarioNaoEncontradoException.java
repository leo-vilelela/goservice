package com.soulcode.goserviceapp.service.exceptions;

import com.soulcode.goserviceapp.domain.Usuario;

public class UsuarioNaoEncontradoException extends RuntimeException{
    public UsuarioNaoEncontradoException(){
        super("Usuario não encontrado!");
    }
    public UsuarioNaoEncontradoException(String message){
        super(message);
    }

}
