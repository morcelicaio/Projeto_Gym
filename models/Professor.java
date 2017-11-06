package br.com.caio.tcc.modelo;

public class Professor {
    private int codProfessor;
    private String nomeProfessor, senhaProfessor;
    
    public void setCodProfessor(int codProfessor){
        this.codProfessor = codProfessor;
    }

    public int getCodProfessor(){
        return codProfessor;
    }
    
    public void setNomeProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeProfessor(){
        return nomeProfessor;
    }
    
    public void setSenhaProfessor(String senhaProfessor){
        this.senhaProfessor = senhaProfessor;
    }

    public String getSenhaProfessor(){
        return senhaProfessor;
    }
}
