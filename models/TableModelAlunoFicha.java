package br.com.caio.tcc.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModelAlunoFicha extends AbstractTableModel{
    private String[] nomeColunas = {"Matrícula", "Nome"};
    private ArrayList<Aluno> alunos;
    
    public TableModelAlunoFicha(){
        alunos = new ArrayList<>();
    }
    
    public TableModelAlunoFicha(ArrayList<Aluno> listaDeAlunos){
        this();
        alunos.addAll(listaDeAlunos);
    }
    
    public Aluno retornarObjetoAlunoFichaSelecionado(int linha){
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
            default:
                throw new UnsupportedOperationException("Operação Sem Suporte");
        }    
    } 
}
