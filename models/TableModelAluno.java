package br.com.caio.tcc.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModelAluno extends AbstractTableModel{
    private String[] nomeColunas = {"Matrícula", "Nome", "Sexo", "Data Nasc", "Rg", "Cpf", "Senha"};
    private ArrayList<Aluno> alunos;
    
    public TableModelAluno(){
        alunos = new ArrayList<>();
    }
    
    public TableModelAluno(ArrayList<Aluno> listaDeAlunos){
        this();
        alunos.addAll(listaDeAlunos);
    }
    
    public Aluno retornarObjetoAlunoSelecionado(int linha){
        return alunos.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return nomeColunas[column];
    }   
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno a = alunos.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return a.getNroMatricula();
            case 1:
                return a.getNomeAluno();
            case 2:
                return a.getSexoAluno();
            case 3:
                return a.getDataNascAluno();
            case 4:
                return a.getRg();
            case 5: 
                return a.getCpf();
            case 6: 
                return a.getSenhaAluno();
            default:
                throw new UnsupportedOperationException("Operação Sem Suporte");
        }    
    } 
}
