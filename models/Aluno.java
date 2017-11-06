package br.com.caio.tcc.modelo;

import java.util.Date;

public class Aluno {
    private int nroMatricula, rg;
    private String cpf;
    private String nomeAluno, sexoAluno, senhaAluno;
    private Date dataNascAluno;
    
     public void setNroMatricula(int nroMatricula){
        this.nroMatricula = nroMatricula;
    }

    public int getNroMatricula(){
        return nroMatricula;
    }
    
     public void setRg(int rg){
        this.rg = rg;
    }

    public int getRg(){
        return rg;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }
    
    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    public String getNomeAluno(){
        return nomeAluno;
    }
    
    public void setSexoAluno(String sexoAluno){
        this.sexoAluno = sexoAluno;
    }

    public String getSexoAluno(){
        return sexoAluno;
    }
    
    public void setSenhaAluno(String senhaAluno){
        this.senhaAluno = senhaAluno;
    }

    public String getSenhaAluno(){
        return senhaAluno;
    }
    
    public void setDataNascAluno(Date dataNascAluno) {
        this.dataNascAluno = dataNascAluno;
    }
    
    public Date getDataNascAluno() {
        return dataNascAluno;
    }
}
