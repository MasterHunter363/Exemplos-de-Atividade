
package controlle;
 
 import model.TarefaModel;
import java.util.ArrayList;
public class TarefaControlle {
 
    //Lista de Tarefas
    private ArrayList<TarefaModel> lista = new ArrayList<>();
    
    // Método Adicionar
    
    
    
    public boolean adicionar (String nome){
    
        // vazio
        if (nome.equals("")) {

            return false;

        }

        // repetido
        for (TarefaModel Tarefa : lista) {

            if ( Tarefa.getNome().equalsIgnoreCase(nome)) {

                return false;

            }
        
        TarefaModel tarefa = new TarefaModel(nome);
        lista.add(tarefa);
        
        }
        return true;
    }
        
         // remover
    public void remover(int posicao){
        
        lista.remove(posicao);

    }

    // concluir
    public void concluir(int posicao) {

        lista.get(posicao).setConcluida(true);

    }

    // retornar lista
    public ArrayList<TarefaModel> getLista() {

        return lista;

    }

    // total
    public int total() {

        return lista.size();

    }
    
    //Método Listar
    
    public ArrayList<TarefaModel> listar(){
        return lista;
    }
    
}

