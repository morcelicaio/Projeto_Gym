package br.com.caio.tcc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao{
    public Connection criarConexao(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_tcc", "root", "morcegocaio");
        }   catch (SQLException e){
                throw new RuntimeException(e);
                }
            }
}
