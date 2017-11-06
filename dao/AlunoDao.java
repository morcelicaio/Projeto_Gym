package br.com.caio.tcc.dao;

import br.com.caio.tcc.modelo.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoDao {
    private Connection con;
    
    public int matriculaAluno;
    public String passwAluno;
    
    public AlunoDao(){
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
    
    public void cadastrarAluno(Aluno aluno){
        PreparedStatement ps = null;
        
        String sql = "INSERT INTO Aluno " +
                     "(nomeAluno, sexoAluno, dataNascAluno, rg, cpf, senhaAluno) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getNomeAluno());
            ps.setString(2, aluno.getSexoAluno());
            ps.setDate(3, new java.sql.Date(aluno.getDataNascAluno().getTime()));
            ps.setInt(4, aluno.getRg());
            ps.setString(5, aluno.getCpf());
            ps.setString(6, aluno.getSenhaAluno());
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
    
    public void alterarAluno(Aluno aluno){
        PreparedStatement ps = null;
        
        String sql = "UPDATE Aluno " +
                     "SET nomeAluno=?, sexoAluno=?, dataNascAluno=?, rg=?, cpf=?, senhaAluno=? " +
                     "WHERE nroMatricula=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getNomeAluno());
            ps.setString(2, aluno.getSexoAluno());
            ps.setDate(3, new java.sql.Date(aluno.getDataNascAluno().getTime()));
            ps.setInt(4, aluno.getRg());
            ps.setString(5, aluno.getCpf());
            ps.setString(6, aluno.getSenhaAluno());
            ps.setInt(7, aluno.getNroMatricula());
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
    
    public void alterarSenhaAluno(Aluno aluno){
        PreparedStatement ps = null;
        
        String sql = "UPDATE Aluno " +
                     "SET senhaAluno=? " +
                     "where nroMatricula=?";
        
        try{
            ps = con.prepareStatement(sql);
        
            ps.setString(1, aluno.getSenhaAluno());
            ps.setInt(2, aluno.getNroMatricula());
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
    
    public void excluirAluno(Aluno aluno){
        PreparedStatement ps = null;
        
        String sql = "DELETE FROM Aluno " +
                     "WHERE nroMatricula=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, aluno.getNroMatricula());
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
    
    public ArrayList<Aluno> buscarAlunos(String s){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Aluno> alunos = null;
        
        try{
            ps = this.con.prepareStatement("SELECT * FROM Aluno WHERE nomeAluno LIKE ?");
            ps.setString(1, s+"%");
            
            rs = ps.executeQuery();
            
            alunos = new ArrayList<>();
            
            while(rs.next()){
                Aluno aluno = new Aluno();
                
                aluno.setNroMatricula(rs.getInt("nroMatricula"));
                aluno.setNomeAluno(rs.getString("nomeAluno"));
                aluno.setSexoAluno(rs.getString("sexoAluno"));
                aluno.setDataNascAluno(rs.getDate("dataNascAluno"));
                aluno.setRg(rs.getInt("rg"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setSenhaAluno(rs.getString("senhaAluno"));
                
                alunos.add(aluno);
            }
        }   catch(SQLException e){
                e.getMessage();
            }   finally{
                    liberarRecursos(con, ps, rs);
                }
        return alunos;
    }
    
    public ArrayList<Aluno> listarAlunos() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Aluno> alunos = null;
        
        try {
            ps = this.con.prepareStatement("SELECT * FROM Aluno");
            rs = ps.executeQuery();
            
            alunos = new ArrayList<>();
            
            while (rs.next()) {
                Aluno a = new Aluno();
                
                a.setNroMatricula(rs.getInt("nroMatricula"));
                a.setNomeAluno(rs.getString("nomeAluno"));
                a.setSexoAluno(rs.getString("sexoAluno"));
                a.setDataNascAluno(rs.getDate("dataNascAluno"));
                a.setRg(rs.getInt("rg"));
                a.setCpf(rs.getString("cpf"));
                a.setSenhaAluno(rs.getString("senhaAluno"));
                
                alunos.add(a);
            }
        } catch (java.sql.SQLException e) {
            throw new java.lang.RuntimeException(e);
        }
         return alunos;
    }
    
    public ArrayList<Aluno> listarAlunosFicha() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Aluno> alunos = null;
        
        try {
            ps = this.con.prepareStatement("SELECT nroMatricula, nomeAluno FROM Aluno");
            rs = ps.executeQuery();
            
            alunos = new ArrayList<>();
            
            while (rs.next()) {
                Aluno a = new Aluno();
                
                a.setNroMatricula(rs.getInt("nroMatricula"));
                a.setNomeAluno(rs.getString("nomeAluno"));
                
                alunos.add(a);
            }
        } catch (java.sql.SQLException e) {
            throw new java.lang.RuntimeException(e);
        }
         return alunos;
    }
    
    public boolean acessarSistemaAluno(int nroMatricula, String senha){
        boolean status = false;
        String sql;
        
        try{
            Connection con = new Conexao().criarConexao();
            
            sql = "SELECT nroMatricula, senhaAluno FROM Aluno WHERE nroMatricula=? AND senhaAluno=?";
            PreparedStatement ps = null;
            
            ps = con.prepareStatement(sql);  
            ps.setInt(1, nroMatricula);  
            ps.setString(2, senha);
            
            ResultSet rs;
            rs = ps.executeQuery();
            
            if(rs.next()){
              matriculaAluno = rs.getInt("nroMatricula"); //variavel matriculaAluno publicada global declarada lá no topo.
              passwAluno = rs.getString("senhaAluno"); //variavel passwAluno publicada global declarada lá no topo.
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
    
    // retorna o último código do aluno inserido no banco
    public int getCodigo(){
        String sql;
        int cod = -1;
        try{
            Connection con = new Conexao().criarConexao();
            
            sql = "SELECT MAX(nroMatricula) FROM Aluno";
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
