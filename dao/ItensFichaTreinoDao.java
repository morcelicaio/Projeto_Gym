package br.com.caio.tcc.dao;

import br.com.caio.tcc.modelo.ItensFichaTreino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItensFichaTreinoDao {
    private Connection con;
    
    public ItensFichaTreinoDao(){
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
    
    private void liberarRecursos(PreparedStatement ps, ResultSet rs, Connection con){
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
    
    public void cadastrarItensDaFicha(ItensFichaTreino itensFichaTreino, int idFicha, int idExercicio){
        PreparedStatement ps = null;
        
        String sql = "INSERT INTO ItensFichaTreino " +
                     "(codFicha, codExercicio, nroMatricula, categoria, nomeExercicio, nroSeries, nroRepeticoes) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try{
                ps = con.prepareStatement(sql);
            
                ps.setInt(1, itensFichaTreino.getCodFicha());
                ps.setInt(2, itensFichaTreino.getCodExercicio());
                ps.setInt(3, itensFichaTreino.getNroMatricula());
                ps.setString(4, itensFichaTreino.getCategoria());
                ps.setString(5, itensFichaTreino.getNomeExercicio());
                ps.setInt(6, itensFichaTreino.getNroSeries());
                ps.setInt(7, itensFichaTreino.getNroRepeticoes());
            
                ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }

    public void excluirItensDaFichaDoAluno(int matricula){
        PreparedStatement ps = null;
        
        String sql = "DELETE FROM ItensFichaTreino " +
                     "WHERE nroMatricula=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, matricula);
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
    
    public boolean verificarExercicioNaFicha(int idFicha, int idExercicio){
        boolean verificador = false;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = this.con.prepareStatement("SELECT * FROM ItensFichaTreino WHERE codFicha = "+idFicha+" AND codExercicio = "+idExercicio);
            rs = ps.executeQuery();
            
            // se existir o exercício na ficha 
            if(rs.next()){
                verificador = true;
            }   
                    
        } catch (java.sql.SQLException e) {
            throw new java.lang.RuntimeException(e);
          }
        
        return verificador;
    }
    
    public ArrayList<ItensFichaTreino> listarItensDaFichaDoAluno(int cod) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<ItensFichaTreino> fichasDeTreino = null;
        
        try {
            ps = this.con.prepareStatement("SELECT categoria, nomeExercicio, nroSeries, nroRepeticoes FROM ItensFichaTreino WHERE nroMatricula = "+cod);
            rs = ps.executeQuery();
            
            fichasDeTreino = new ArrayList<>();
            
            while (rs.next()) {
                ItensFichaTreino ift = new ItensFichaTreino();
                
                ift.setCategoria(rs.getString("categoria"));
                ift.setNomeExercicio(rs.getString("nomeExercicio"));
                ift.setNroSeries(rs.getInt("nroSeries"));
                ift.setNroRepeticoes(rs.getInt("nroRepeticoes"));
                
                fichasDeTreino.add(ift);
            }
        } catch (java.sql.SQLException e) {
            throw new java.lang.RuntimeException(e);
        }
         return fichasDeTreino;
    }
    
    public int retornaMatriculaAluno(){
        String sql;
        int cod = -1;
        try{
            Connection con = new Conexao().criarConexao();
            
            sql = "SELECT MAX(nroMatricula) FROM ItensFichaTreino";
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
    
 
    public int retornaCodExercicio(String categoria, String nomeExercicio){
        String sql;
        int cod = 0;
        try{
            Connection con = new Conexao().criarConexao();
            
            sql = "SELECT codExercicio FROM Exercicio WHERE categoria='"+categoria+"' AND nomeExercicio ='"+nomeExercicio+"'";
            PreparedStatement ps = null;
            ps = con.prepareStatement(sql);  
            
            ResultSet rs;
            rs = ps.executeQuery();

            if(rs.next()){
                cod = (rs.getInt("codExercicio"));
            }   else{
                    ps.close();
                }
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }
        return cod;
    }
    
    public void excluirItensDaFichaDoAlunoAuxiliar(int matricula, int codExercicio){
        PreparedStatement ps = null;
        
        String sql = "DELETE FROM ItensFichaTreino " +
                     "WHERE nroMatricula=? AND codExercicio=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, matricula);
            ps.setInt(2, codExercicio);
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
}

