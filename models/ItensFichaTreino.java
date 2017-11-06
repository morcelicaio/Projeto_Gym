package br.com.caio.tcc.modelo;

public class ItensFichaTreino {
    private int codFicha, nroMatricula, codExercicio, nroSeries, nroRepeticoes;
    private String categoria, nomeExercicio; 
        
    public void setCodFicha(int codFicha){
        this.codFicha = codFicha;
    }

    public int getCodFicha(){
        return codFicha;
    }
    
    public void setNroMatricula(int nroMatricula){
        this.nroMatricula = nroMatricula;
    }

    public int getNroMatricula(){
        return nroMatricula;
    }
    
    public void setCodExercicio(int codExercicio){
        this.codExercicio = codExercicio;
    }

    public int getCodExercicio(){
        return codExercicio;
    }
    
    public void setNroSeries(int nroSeries){
        this.nroSeries = nroSeries;
    }

    public int getNroSeries(){
        return nroSeries;
    }
    
    public void setNroRepeticoes(int nroRepeticoes){
        this.nroRepeticoes = nroRepeticoes;
    }

    public int getNroRepeticoes(){
        return nroRepeticoes;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setNomeExercicio(String nomeExercicio){
        this.nomeExercicio = nomeExercicio;
    }
    
    public String getNomeExercicio(){
        return nomeExercicio;
    }
}
