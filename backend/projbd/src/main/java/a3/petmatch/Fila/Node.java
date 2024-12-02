package a3.petmatch.Fila;

public class Node {
    public String nome;
    public String email;
    public String senha;
    public String telefone;
    public String endereco;
    public Node next;

    public Node(String nomePessoa, String emailPessoa, String senhaPessoa, String telefonePessoa, String enderecoPessoa){
        nome = nomePessoa;
        email = emailPessoa;
        senha = senhaPessoa;
        telefone = telefonePessoa;
        endereco = enderecoPessoa;
        next = null;
    }

    public void displayNode(){
        System.out.println(nome);
    }

}
