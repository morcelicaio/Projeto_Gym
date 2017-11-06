package br.com.caio.tcc.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModelTodosExercicios extends AbstractTableModel{
    private String[] nomeColunas = {"Código", "Categoria", "Nome", "Descrição"};
    private ArrayList<Exercicio> exercicios;
    
    public TableModelTodosExercicios(){
        exercicios = new ArrayList<>();
    }
    
    public TableModelTodosExercicios(ArrayList<Exercicio> listaDeExercicios){
        this();
        exercicios.addAll(listaDeExercicios);
    }
    
    public Exercicio retornarObjetoExercicioSelecionado(int linha){
        return exercicios.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return exercicios.size();
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
        Exercicio e = exercicios.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return e.getCodExercicio();
            case 1:
                return e.getCategoriaExercicio(); 
            case 2:
                return e.getNomeExercicio();
            case 3:
                return e.getFuncaoExercicio();
            default:
                throw new UnsupportedOperationException("Operação Sem Suporte");
        }    
    } 
}
