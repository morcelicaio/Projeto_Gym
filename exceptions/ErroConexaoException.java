package br.com.caio.tcc.imagem.excecao;

import java.sql.SQLException;

public class ErroConexaoException extends RuntimeException {
    public ErroConexaoException(String mensagem, SQLException e){        
        super(e.getErrorCode() + ": "+ mensagem);
    }    
}