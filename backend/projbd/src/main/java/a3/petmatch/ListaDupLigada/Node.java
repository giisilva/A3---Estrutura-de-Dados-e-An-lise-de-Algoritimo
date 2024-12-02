package a3.petmatch.ListaDupLigada;
public class Node {
    private String nome;
    private int idade;
    private String especie;
    private String raca;
    private String perfil;
    private String status;
    private Node nextNode;
    private Node prevNode;
    
    public Node(String nomePet, int idadePet, String especiePet, String racaPet, String perfilPet, String statusPet){
        this.nome = nomePet;
        this.idade = idadePet;
        this.especie = especiePet;
        this.raca = racaPet;
        this.perfil = perfilPet;
        this.status = statusPet;
        nextNode = null;
        prevNode = null;
    }
    
    public Node getNextNode(){
        return nextNode;
    }
    
    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public Node getPrevNode(){
        return prevNode;
    }
    
    public void setPrevNode(Node prevNode){
        this.prevNode = prevNode;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
