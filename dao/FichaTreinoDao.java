package br.com.caio.tcc.dao;

import br.com.caio.tcc.modelo.FichaTreino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FichaTreinoDao {
    private Connection con;
    
    public FichaTreinoDao(){
        con = new Conexao().criarConexao();
    }
                    
    private void liberarRecursos(Connection con, PreparedStatement ps){
        if(ps != null){
            try{
                ps.close();
            }   catch(SQLException e){
                    throw new RuntimeException(e);
                }
        }
        
        if(con != null){
            try{
                con.close();
            }   catch(SQLException e){
                    throw new RuntimeException(e);
                }
        }        
    }
    
    
    private void liberarRecursos(Connection con, PreparedStatement ps, ResultSet rs){
        if(ps != null){
            try{
                ps.close();
            }   catch(SQLException e){
                    throw new RuntimeException(e);
                }
        }
        
        if(rs != null){
            try{
                rs.close();
            }   catch(SQLException e){
                    throw new RuntimeException(e);
                }
        }
        
        if(con != null){
            try{
                con.close();
            }   catch(SQLException e){
                    throw new RuntimeException(e);
                }
        }        
    }
    
    public void cadastrarFichaTreino(FichaTreino fichaTreino){
        PreparedStatement ps = null;
        
        String sql = "INSERT INTO FichaTreino " +
                     "(nroMatricula, codProfessor) " +
                     "VALUES (?, ?)";
        
        try{
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, fichaTreino.getNroMatricula());
            ps.setInt(2, fichaTreino.getCodProfessor());
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
    
    public int retornaCodigoDaFichaCriada(){
        String sql;
        int codFicha = -1;
        try{
            Connection con = new Conexao().criarConexao();
            
            sql = "SELECT MAX(codFicha) FROM FichaTreino";
            PreparedStatement ps = null;
            ps = con.prepareStatement(sql);  
            
            ResultSet rs;
            rs = ps.executeQuery();

            if(rs.next()){
                codFicha = rs.getInt(1);
            }   else{
                    ps.close();
                }
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }
        
        return codFicha;
    }
    
    public int retornaNroMatriculaDaFichaCriada(){
        String sql;
        int matricula = -1;
        try{
            Connection con = new Conexao().criarConexao();
            
            sql = "SELECT MAX(codFicha) FROM FichaTreino";
            PreparedStatement ps = null;
            ps = con.prepareStatement(sql);  
            
            ResultSet rs;
            rs = ps.executeQuery();

            if(rs.next()){
                matricula = rs.getInt(1);
            }   else{
                    ps.close();
                }
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }
        
        return matricula;
    }
    
}
