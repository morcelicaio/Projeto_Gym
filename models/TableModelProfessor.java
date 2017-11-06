package br.com.caio.tcc.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModelProfessor extends AbstractTableModel{
    private String[] nomeColunas = {"Código", "Nome", "Senha"};
    private ArrayList<Professor> professores;
    
    public TableModelProfessor(){
        professores = new ArrayList<>();
    }
    
    public TableModelProfessor(ArrayList<Professor> listaDeProfessores){
        this();
        professores.addAll(listaDeProfessores);
    }
    
    public Professor retornarObjetoProfessorSelecionado(int linha){
        return professores.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return professores.size();
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
        Professor p = professores.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return p.getCodProfessor();
            case 1:
                return p.getNomeProfessor();
            case 2:
                return p.getSenhaProfessor();
            default:
                throw new UnsupportedOperationException("Operação Sem Suporte");
        }    
    } 
}
