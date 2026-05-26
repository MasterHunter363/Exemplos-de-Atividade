
package controlle;
 
 import model.TarefaModel;
import java.util.ArrayList;
public class TarefaControlle {
 
    //Lista de Tarefas
    private ArrayList<TarefaModel> lista = new ArrayList<>();
    
    // Método Adicionar
    
    public void adicionar (String nome){
    
        
        TarefaModel tarefa = new TarefaModel(nome);
        lista.add(tarefa);
    }
    
    //Método Listar
    
    public ArrayList<TarefaModel> listar(){
        return lista;
    }
    
}

