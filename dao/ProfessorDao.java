package br.com.caio.tcc.dao;

import br.com.caio.tcc.modelo.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProfessorDao {
    private Connection con;
    
    public int codProf;
    public String passwProf;
    
    public ProfessorDao(){
        con = new Conexao().criarConexao();
    }
    
    private void liberarRecursos(Connection c, PreparedStatement ps){
        if(ps != null){
            try{
                ps.close();
            }   catch(SQLException e){
                    throw new RuntimeException(e);
                }
        }
        
        if(c != null){
            try{
                c.close();
            }   catch(SQLException e){
                    throw new RuntimeException(e);
                }
        }        
    }
    
    private void liberarRecursos(Connection c, PreparedStatement ps, ResultSet rs){
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
    
    public void cadastrarProfessor(Professor professor){
        PreparedStatement ps = null;
        
        String sql = "INSERT INTO Professor " +
                     "(nomeProfessor, senhaProfessor) " +
                     "VALUES (?, ?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, professor.getNomeProfessor());
            ps.setString(2, professor.getSenhaProfessor());
            
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
    
    public void alterarProfessor(Professor professor){
        PreparedStatement ps = null;
        
        String sql = "UPDATE Professor " +
                     "SET nomeProfessor=?, senhaProfessor=? " +
                     "WHERE codProfessor=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, professor.getNomeProfessor());
            ps.setString(2, professor.getSenhaProfessor());
            ps.setInt(3, professor.getCodProfessor());
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
    
    public void alterarSenhaProfessor(Professor professor){
        PreparedStatement ps = null;
        
        String sql = "UPDATE Professor " +
                     "SET senhaProfessor=? " +
                     "where codProfessor=?";
        
        try{
            ps = con.prepareStatement(sql);
        
            ps.setString(1, professor.getSenhaProfessor());
            ps.setInt(2, professor.getCodProfessor());
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
    
    public void excluirProfessor(Professor professor){
        PreparedStatement ps = null;
        
        String sql = "DELETE FROM Professor " +
                     "WHERE codProfessor=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, professor.getCodProfessor());
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
    
    public ArrayList<Professor> listarProfessores() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Professor> professores = null;
        
        try {
            ps = this.con.prepareStatement("SELECT * FROM Professor");
            rs = ps.executeQuery();
            
            professores = new ArrayList<>();
            
            while (rs.next()) {
                Professor p = new Professor();
                p.setCodProfessor(rs.getInt("codProfessor"));
                p.setNomeProfessor(rs.getString("nomeProfessor"));
                p.setSenhaProfessor(rs.getString("senhaProfessor"));
                
                professores.add(p);
            }
        } catch (java.sql.SQLException e) {
            throw new java.lang.RuntimeException(e);
        }
         return professores;
    }
    
    public ArrayList<Professor> buscarProfessores(String s){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Professor> professores = null;
        
        try{
            ps = this.con.prepareStatement("SELECT * FROM Professor WHERE nomeProfessor LIKE ?");
            ps.setString(1, s+"%");
            
            rs = ps.executeQuery();
            
            professores = new ArrayList<>();

            while (rs.next()) {
                Professor professor = new Professor();
                
                professor.setCodProfessor(rs.getInt("codProfessor"));
                professor.setNomeProfessor(rs.getString("nomeProfessor"));
                professor.setSenhaProfessor(rs.getString("senhaProfessor"));

                professores.add(professor);
            }
        }   catch(Exception e){
                e.getMessage();
            }   finally{
                    liberarRecursos(con, ps, rs);
                }        
        return professores;         
    }    
    
    public boolean acessarSistemaProfessor(int codigo, String senha){
        boolean status = false;
        String sql;
        
        try{
            Connection con = new Conexao().criarConexao();
            
            sql = "SELECT codProfessor, senhaProfessor FROM Professor WHERE codProfessor=? AND senhaProfessor=?";
            PreparedStatement ps = null;
            
            ps = con.prepareStatement(sql);  
            ps.setInt(1, codigo);  
            ps.setString(2, senha);
            
            ResultSet rs;
            rs = ps.executeQuery();
            
            if(rs.next()){
              codProf = rs.getInt("codProfessor"); //variavel codProf publicada global declarada lá no topo.
              passwProf = rs.getString("senhaProfessor"); //variavel passwProf publicada global declarada lá no topo.
           
              status = true;
            }   else{
                    ps.close();
                    return status;
                }
            
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }
        
        return status;
    }
    
    // retorna o último código do professor inserido no banco.
    public int getCodigo(){
        String sql;
        int cod = -1;
        try{
            Connection con = new Conexao().criarConexao();
            
            sql = "SELECT MAX(codProfessor) FROM Professor";
            PreparedStatement ps = null;
            ps = con.prepareStatement(sql);  
            
            ResultSet rs;
            rs = ps.executeQuery();

            if(rs.next()){
                cod = rs.getInt(1);
            }   else{
                    ps.close();
                }
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }
        return cod;
    }
}
