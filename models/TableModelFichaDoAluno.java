package br.com.caio.tcc.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class TableModelFichaDoAluno extends AbstractTableModel{
    private String[] nomeColunas = {"Categoria", "Exercício", "Séries", "Repetições"};
    private ArrayList<ItensFichaTreino> fichaAlunos;
    private ArrayList<Exercicio> exerciciosAdicionados;
    private ArrayList<Exercicio> exercicios;
    
    public TableModelFichaDoAluno(){
        fichaAlunos = new ArrayList<>();
    }
    
    private Exercicio isExercicioNaFicha(Exercicio exercicio){               
        for (Exercicio itemLista: exerciciosAdicionados){
            if (exercicio.getCodExercicio() == itemLista.getCodExercicio()){
                return itemLista;
            }
        }
        return null;
    }    
    
    public void setExerciciosAdicionados(Exercicio novoExercicio){
        Exercicio exercicioExistente = isExercicioNaFicha(novoExercicio);
        //Se o produto existir na ficha, atualiza a quantidade, caso contrário, adiciona um novo produto
        if (exercicioExistente != null){
        
        } else {
            exerciciosAdicionados.add(novoExercicio);             
        }
        fireTableDataChanged();                 
    }
    
    public TableModelFichaDoAluno(ArrayList<ItensFichaTreino> listaDeFichasDeTreino){
        this();
        fichaAlunos.addAll(listaDeFichasDeTreino);
    }
    
    public ItensFichaTreino retornarObjetoProfessorSelecionado(int linha){
        return fichaAlunos.get(linha);
    }
    
    public Exercicio retornarObjetoExercicioSelecionado(int linha){
        return exercicios.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return fichaAlunos.size();
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
        ItensFichaTreino ift = fichaAlunos.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return ift.getCategoria();
            case 1:
                return ift.getNomeExercicio();
            case 2:
                return ift.getNroSeries();
            case 3:
                return ift.getNroRepeticoes();
            default:
                throw new UnsupportedOperationException("Operação Sem Suporte");
        }    
    } 
}
    

