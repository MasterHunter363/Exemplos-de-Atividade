package model;

public class TarefaModel {

    //Atributos 
    private String nome;
    private boolean concluida;

    //Contrutor
    public TarefaModel(String nome) {
        this.nome = nome;
        this.concluida = false;
    }
    // Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {

        if (concluida == true) {

            return nome + "concluido";

        } else {
            return nome + "Pendente";

        }
    }
}
   


