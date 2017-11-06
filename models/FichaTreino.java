package br.com.caio.tcc.modelo;

public class FichaTreino {
    private int codFicha, nroMatricula, codProfessor;
    
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
    
    public void setCodProfessor(int codProfessor){
        this.codProfessor = codProfessor;
    }

    public int getCodProfessor(){
        return codProfessor;
    }
}
