package br.com.caio.tcc.modelo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;

public class Exercicio implements Serializable{
    private int codExercicio;
    private String categoriaExercicio, nomeExercicio, funcaoExercicio;
    private BufferedImage foto ;

    
    public BufferedImage getFoto() {
        return foto;
    }
    
    public void setFoto(BufferedImage foto) {
        this.foto = foto;
    }
    
    public void setCodExercicio(int codExercicio){
        this.codExercicio = codExercicio;
    }

    public int getCodExercicio(){
        return codExercicio;
    }
    
    public void setCategoriaExercicio(String categoriaExercicio){
        this.categoriaExercicio = categoriaExercicio;
    }

    public String getCategoriaExercicio(){
        return categoriaExercicio;
    }
    
    public void setNomeExercicio(String nomeExercicio){
        this.nomeExercicio = nomeExercicio;
    }

    public String getNomeExercicio(){
        return nomeExercicio;
    }
    
    public void setFuncaoExercicio(String funcaoExercicio){
        this.funcaoExercicio = funcaoExercicio;
    }

    public String getFuncaoExercicio(){
        return funcaoExercicio;
    }
}
