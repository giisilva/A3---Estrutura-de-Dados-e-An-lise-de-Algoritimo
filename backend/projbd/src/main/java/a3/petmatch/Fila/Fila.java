package a3.petmatch.Fila;
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

    public void addFila(String nomePessoa, String emailPessoa, String senhaPessoa, String telefonePessoa, String enderecoPessoa){
        Node newNode = new Node(nomePessoa, emailPessoa, senhaPessoa, telefonePessoa, enderecoPessoa);

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
        String pessoaRemovido = inicio.nome;
        inicio = inicio.next;
        if(inicio == null){
            fim= null;
        }
        tam--;
        return pessoaRemovido;
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
                System.out.println("pessoa: " + atual.nome + ", " + atual.email + ", " + atual.senha + ", " + atual.telefone + ", " + atual.endereco);
                atual = atual.next;
            }
            System.out.println();
        }
    }
}
