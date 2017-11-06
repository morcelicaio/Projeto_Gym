package br.com.caio.tcc.dao;

import br.com.caio.tcc.modelo.Exercicio;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class ExercicioDao {
    private Connection con;
    
    public ExercicioDao(){
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
    
    public void cadastrarExercicio(Exercicio exercicio, File img){
        PreparedStatement ps = null;
        
        String sql = "INSERT INTO Exercicio " +
                     "(categoria, nomeExercicio, funcaoExercicio, foto) " +
                     "VALUES (?, ?, ?, ?)";
        
        try{
            ps = con.prepareStatement(sql);
            
            FileInputStream fis = new FileInputStream(img);
                        
            ps.setString(1, exercicio.getCategoriaExercicio());
            ps.setString(2, exercicio.getNomeExercicio());
            ps.setString(3, exercicio.getFuncaoExercicio());
            ps.setBinaryStream(4, fis);
            
            ps.executeUpdate();
        }   catch(FileNotFoundException fnf){
                throw new RuntimeException(fnf);
            }   catch(SQLException e){
                    throw new RuntimeException(e);
                }   finally{
                        liberarRecursos(con, ps);
                    }
    }
  
    public void alterarExercicio(Exercicio exercicio, File img){
        PreparedStatement ps = null;
        
        String sql = "UPDATE Exercicio " +
                     "SET categoria=?, nomeExercicio=?, funcaoExercicio=?, foto=? " +
                     "WHERE codExercicio=?";
        
        try{
            ps = con.prepareStatement(sql);
            
            FileInputStream fis = new FileInputStream(img);
            
            ps.setString(1, exercicio.getCategoriaExercicio());
            ps.setString(2, exercicio.getNomeExercicio());
            ps.setString(3, exercicio.getFuncaoExercicio());
            ps.setBinaryStream(4, fis);
            ps.setInt(5, exercicio.getCodExercicio());
            
            
            ps.executeUpdate();
        }   catch(FileNotFoundException fnf){
                throw new RuntimeException(fnf);
            }   catch(SQLException e){
                    throw new RuntimeException(e);
                }   finally{
                        liberarRecursos(con, ps);
                    }
    }
    
    public void alterarExercicio(Exercicio exercicio){
        PreparedStatement ps = null;
        
        String sql = "UPDATE Exercicio " +
                     "SET categoria=?, nomeExercicio=?, funcaoExercicio=? " +
                     "WHERE codExercicio=?";
        
        try{
            ps = con.prepareStatement(sql);
       
            ps.setString(1, exercicio.getCategoriaExercicio());
            ps.setString(2, exercicio.getNomeExercicio());
            ps.setString(3, exercicio.getFuncaoExercicio());
            ps.setInt(4, exercicio.getCodExercicio());
            
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{        
                    liberarRecursos(con, ps);
                }
    }
    
    public void excluirExercicio(Exercicio exercicio){
        PreparedStatement ps = null;
        
        String sql = "DELETE FROM Exercicio " +
                     "WHERE codExercicio=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, exercicio.getCodExercicio());
            
            ps.executeUpdate();
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }   finally{
                    liberarRecursos(con, ps);
                }
    }
    
   public BufferedImage abrirFoto(int cod){
       
        PreparedStatement ps = null;
        ResultSet rs = null;
        BufferedImage bi = null;
        
        try{
            ps = this.con.prepareStatement("SELECT foto FROM Exercicio WHERE codExercicio = ?");
            
            ps.setInt(1, cod);
            rs = ps.executeQuery();
            
            rs.next();
                
            //lendo a imagem como um InputStream
            InputStream img = rs.getBinaryStream("foto");

            //decodificando o InputStream como um BufferedImage
            bi = ImageIO.read(img);
            
        } catch(IOException ioe){
            throw new RuntimeException(ioe);
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }     
        
        return bi;
    }
    
    public ArrayList<Exercicio> buscarExercicios(String s){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exercicio> exercicios = null;
        
        try{
            ps = this.con.prepareStatement("SELECT codExercicio, categoria, nomeExercicio FROM Exercicio WHERE nomeExercicio LIKE ?");
            ps.setString(1, s+"%");
            
            rs = ps.executeQuery();
            
            exercicios = new ArrayList<>();
            
            while(rs.next()){
                Exercicio exercicio = new Exercicio();
                
                exercicio.setCodExercicio(rs.getInt("codExercicio"));
                exercicio.setCategoriaExercicio(rs.getString("categoria"));
                exercicio.setNomeExercicio(rs.getString("nomeExercicio"));
                
                exercicios.add(exercicio);
            }
        }   catch(SQLException e){
                e.getMessage();
            }   finally{
                    liberarRecursos(con, ps, rs);
                }
        
        return exercicios;
    }
    
    public ArrayList<Exercicio> listarExerciciosConsulta(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exercicio> exercicios = null;
        try{
            ps = this.con.prepareStatement("SELECT codExercicio, categoria, nomeExercicio FROM Exercicio order by categoria");
            rs = ps.executeQuery();
            
            exercicios = new ArrayList<>();

            while (rs.next()) {
                Exercicio e = new Exercicio();
                
                e.setCodExercicio(rs.getInt("codExercicio"));
                e.setCategoriaExercicio(rs.getString("categoria"));
                e.setNomeExercicio(rs.getString("nomeExercicio"));
                
                exercicios.add(e);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return exercicios;        
    }
    
    public ArrayList<Exercicio> listarExercicios(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exercicio> exercicios = null;
        try{
            ps = this.con.prepareStatement("SELECT codExercicio, categoria, nomeExercicio, funcaoExercicio FROM Exercicio order by categoria");
            rs = ps.executeQuery();
            
            exercicios = new ArrayList<>();

            while (rs.next()) {
                Exercicio e = new Exercicio();
                
                
                
                e.setCodExercicio(rs.getInt("codExercicio"));
                e.setCategoriaExercicio(rs.getString("categoria"));
                e.setNomeExercicio(rs.getString("nomeExercicio"));
                e.setFuncaoExercicio(rs.getString("funcaoExercicio"));
                
                exercicios.add(e);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return exercicios;        
    }
    
    public ArrayList<Exercicio> listarExerciciosFicha(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exercicio> exercicios = null;
        try{
            ps = this.con.prepareStatement("SELECT codExercicio, categoria, nomeExercicio FROM Exercicio order by codExercicio");
            rs = ps.executeQuery();
            
            exercicios = new ArrayList<>();

            while (rs.next()) {
                Exercicio e = new Exercicio();
                
                e.setCodExercicio(rs.getInt("codExercicio"));
                e.setCategoriaExercicio(rs.getString("categoria"));
                e.setNomeExercicio(rs.getString("nomeExercicio"));

                exercicios.add(e);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return exercicios;        
    }
    
    public ArrayList<Exercicio> listarExerciciosOmbro(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exercicio> exercicios = null;

        try{
            ps = this.con.prepareStatement("SELECT codExercicio, categoria, nomeExercicio, funcaoExercicio FROM Exercicio WHERE categoria = 'Ombros'");
            rs = ps.executeQuery();
            
            exercicios = new ArrayList<>();
            
            while (rs.next()) {
                Exercicio e = new Exercicio();
                
                e.setCodExercicio(rs.getInt("codExercicio"));
                e.setCategoriaExercicio(rs.getString("categoria"));
                e.setNomeExercicio(rs.getString("nomeExercicio"));
                e.setFuncaoExercicio(rs.getString("funcaoExercicio"));

                exercicios.add(e);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return exercicios;        
    }
    
    public ArrayList<Exercicio> listarExerciciosTorax(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exercicio> exercicios = null;

        try{
            ps = this.con.prepareStatement("SELECT codExercicio, categoria, nomeExercicio, funcaoExercicio FROM Exercicio WHERE categoria = 'Tórax'");
            rs = ps.executeQuery();
            
            exercicios = new ArrayList<>();
            
            while (rs.next()) {
                Exercicio e = new Exercicio();
                
                e.setCodExercicio(rs.getInt("codExercicio"));
                e.setCategoriaExercicio(rs.getString("categoria"));
                e.setNomeExercicio(rs.getString("nomeExercicio"));
                e.setFuncaoExercicio(rs.getString("funcaoExercicio"));

                exercicios.add(e);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return exercicios;        
    }
    
    public ArrayList<Exercicio> listarExerciciosBracos(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exercicio> exercicios = null;

        try{
            ps = this.con.prepareStatement("SELECT codExercicio, categoria, nomeExercicio, funcaoExercicio FROM Exercicio WHERE categoria = 'Bracos'");
            rs = ps.executeQuery();
            
            exercicios = new ArrayList<>();
            
            while (rs.next()) {
                Exercicio e = new Exercicio();
                
                e.setCodExercicio(rs.getInt("codExercicio"));
                e.setCategoriaExercicio(rs.getString("categoria"));
                e.setNomeExercicio(rs.getString("nomeExercicio"));
                e.setFuncaoExercicio(rs.getString("funcaoExercicio"));

                exercicios.add(e);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return exercicios;        
    }
    
    public ArrayList<Exercicio> listarExerciciosCostas(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exercicio> exercicios = null;

        try{
            ps = this.con.prepareStatement("SELECT codExercicio, categoria, nomeExercicio, funcaoExercicio FROM Exercicio WHERE categoria = 'Costas'");
            rs = ps.executeQuery();
            
            exercicios = new ArrayList<>();
            
            while (rs.next()) {
                Exercicio e = new Exercicio();
                
                e.setCodExercicio(rs.getInt("codExercicio"));
                e.setCategoriaExercicio(rs.getString("categoria"));
                e.setNomeExercicio(rs.getString("nomeExercicio"));
                e.setFuncaoExercicio(rs.getString("funcaoExercicio"));

                exercicios.add(e);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return exercicios;        
    }
    
    public ArrayList<Exercicio> listarExerciciosPernas(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exercicio> exercicios = null;

        try{
            ps = this.con.prepareStatement("SELECT codExercicio, categoria, nomeExercicio, funcaoExercicio FROM Exercicio WHERE categoria = 'Pernas'");
            rs = ps.executeQuery();
            
            exercicios = new ArrayList<>();
            
            while (rs.next()) {
                Exercicio e = new Exercicio();
                
                e.setCodExercicio(rs.getInt("codExercicio"));
                e.setCategoriaExercicio(rs.getString("categoria"));
                e.setNomeExercicio(rs.getString("nomeExercicio"));
                e.setFuncaoExercicio(rs.getString("funcaoExercicio"));

                exercicios.add(e);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return exercicios;        
    }
    
    public ArrayList<Exercicio> listarExerciciosAbdominais(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Exercicio> exercicios = null;

        try{
            ps = this.con.prepareStatement("SELECT codExercicio, categoria, nomeExercicio, funcaoExercicio FROM Exercicio WHERE categoria = 'Abdominais'");
            rs = ps.executeQuery();
            
            exercicios = new ArrayList<>();
            
            while (rs.next()) {
                Exercicio e = new Exercicio();
                
                e.setCodExercicio(rs.getInt("codExercicio"));
                e.setCategoriaExercicio(rs.getString("categoria"));
                e.setNomeExercicio(rs.getString("nomeExercicio"));
                e.setFuncaoExercicio(rs.getString("funcaoExercicio"));

                exercicios.add(e);
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }  finally{
            liberarRecursos(con, ps, rs);
        }        
        return exercicios;        
    }
    
    public int retornaCodExercicio(String categoria, String nomeEx){
        String sql;
        int codExercicio = 0;
        
        try{
            Connection con = new Conexao().criarConexao();
            
            sql = "SELECT codExercicio FROM Exercicio WHERE categoria='"+categoria+"' AND nomeExercicio='"+nomeEx+"'";
            PreparedStatement ps = null;
            ps = con.prepareStatement(sql);  
            
            ResultSet rs;
            rs = ps.executeQuery();

            if(rs.next()){
                codExercicio = rs.getInt("codExercicio");
            }   else{
                    ps.close();
                }
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }
        
        return codExercicio;
    }
    
    public String retornaDescricaoExercicio(String categoria, String nomeEx){
        String sql;
        String descricaoExercicio = "";
        
        try{
            Connection con = new Conexao().criarConexao();
            
            sql = "SELECT funcaoExercicio FROM Exercicio WHERE categoria='"+categoria+"' AND nomeExercicio='"+nomeEx+"'";
            PreparedStatement ps = null;
            ps = con.prepareStatement(sql);  
            
            ResultSet rs;
            rs = ps.executeQuery();

            if(rs.next()){
                descricaoExercicio = rs.getString("funcaoExercicio");
            }   else{
                    ps.close();
                }
        }   catch(SQLException e){
                throw new RuntimeException(e);
            }
        
        return descricaoExercicio;
    }
}
