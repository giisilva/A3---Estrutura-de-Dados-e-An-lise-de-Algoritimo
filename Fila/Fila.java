package Fila;

public class Fila {
    private Node inicio, fim;
    int tam;

    public Fila(){
        inicio = fim = null;
        tam = 0;
    }

    public boolean isEmpty(){
        return (inicio == null);
    }

    public void addFila(String nomePessoa){
        Node newNode = new Node(nomePessoa);

        if(isEmpty()){
            inicio = fim= newNode;
        }else{
            fim.next = newNode;
            fim = newNode;
        }
        tam++;
    }

    public String removeFila(){
        if(isEmpty()){
            return null;
        }
        String nomeRemovido = inicio.Dado;
        inicio = inicio.next;
        if(inicio == null){
            fim= null;
        }
        tam--;
        return nomeRemovido;
    }

    public int tamanho(){
        return tam;
    }

    public void printFila(){
        if(isEmpty()){
            System.out.println("Fila está vazia");
        }else{
            Node atual = inicio;
            while (atual!=null){
                System.out.println(atual.Dado + " ");
                atual = atual.next;
            }
            System.out.println();
        }
    }
}
