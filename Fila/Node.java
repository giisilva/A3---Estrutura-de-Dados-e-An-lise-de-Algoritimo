package Fila;

public class Node {
    public String Dado;
    public Node next;

    public Node(String nomePessoa){
        Dado = nomePessoa;
        next = null;
    }

    public void displayNode(){
        System.out.println(Dado);
    }

}
