package a3.petmatch.ListaDupLigada;
public class ListaPet {
    private Node firstNode;
    private Node lastNode;
    private String nome;
    
    public ListaPet(){
        this("lista");
    }
    
    public ListaPet(String listaPet){
        nome= listaPet;
        firstNode = lastNode = null;
    }
    
    public void addStart(String nomePet, int idadePet, String especiePet, String racaPet, String perfilPet, String statusPet) {
        Node newNode = new Node(nomePet, idadePet, especiePet, racaPet, perfilPet, statusPet);

        if (firstNode == null) {
            firstNode = lastNode = newNode; // Se a lista está vazia, ambos os nós recebem novo nó
        } else {
            newNode.setNextNode(firstNode); // o próximo nó se conecta ao que era o primeiro nó
            firstNode.setPrevNode(newNode); // o antigo primeiro nó aponta para o novo nó como anterior
            firstNode = newNode;         // Atualiza o primeiro nó
        }

    }
    public void addEnd(String nomePet, int idadePet, String especiePet, String racaPet, String perfilPet, String statusPet) {
        Node newNode = new Node(nomePet, idadePet, especiePet, racaPet, perfilPet, statusPet);
    
        if (firstNode == null) {
            firstNode = lastNode = newNode; // Se a lista está vazia, ambos os nós recebem novo nó
        } else {
            newNode.setPrevNode(lastNode); // Conecta o último nó ao novo nó
            lastNode.setNextNode(newNode); // Conecta o novo nó ao antigo último nó
            lastNode = newNode;         // Atualiza o último nó
        }
    }

    public boolean addMiddle(String key, 
    String nomePet, int idadePet, String especiePet, String racaPet, String perfilTextPet, String statusPet) {
        Node atual = firstNode;

        if (atual == null) {
            return false;
        }
            
        while (atual.getNome()!=key) {
            atual = atual.getNextNode();
            if (atual == null){
            return false;
            }
        }

        Node newNode = new Node(nomePet, idadePet, especiePet, racaPet, perfilTextPet, statusPet);

        // Insere o novo nó entre o nó atual e o próximo nó
        newNode.setPrevNode(atual);
        newNode.setNextNode(atual.getNextNode());

        if (atual.getNextNode() != null) {
            atual.getNextNode().setPrevNode(newNode); // Ajusta o nó seguinte, se existir
        }
    
        atual.setNextNode(newNode); // O nó atual aponta para o novo nó

        // Se o nó atual for o último nó, atualiza o último nó
        if (atual == lastNode) {
            lastNode = newNode;
        }

        return true; // Retorna true indicando que a inserção foi bem-sucedida
    }

    public void removeStart() {
        if(firstNode == null){
            System.out.println("A lista está vazia");
            return;
        }

        if (firstNode == lastNode){
            firstNode = lastNode = null;
        }else{
            firstNode = firstNode.getNextNode();
            firstNode.setPrevNode(null);
        }

    }

    public void removeEnd() {
        if(lastNode == null){
            System.out.println("A lista está vazia");
            return;
        }

        if (firstNode == lastNode){
            firstNode = lastNode = null;
        }else{
            lastNode = lastNode.getPrevNode();
            lastNode.setNextNode(null);
        }


    }

    public boolean removeMiddle(String key) {
        Node atual = firstNode;

        while(atual != null && !atual.getNome().equals(key)){
            atual = atual.getNextNode();
        }

        if(atual==null){
            System.out.println("Dado não encontrado");
            return false;
        }

        Node proximo = atual.getNextNode();
            if (proximo == null) {
            System.out.println("Não há um nó após o especificado para remover.");
        return false;
    }

    // Atualize as referências para remover o nó seguinte
    if (proximo == lastNode) { // Se for o último nó
        removeEnd();
    } else {
        proximo.getNextNode().setPrevNode(atual);
        atual.setNextNode(proximo.getNextNode());
    }
        
        return true;

    }

    public void printLista() {
        System.out.println(nome);
        if (firstNode == null) {
            System.out.println("A lista está vazia.");
            return; // Não tenta percorrer a lista se estiver vazia
        }

        Node atual = firstNode;
        while (atual != null) {
            System.out.println("pet: " + atual.getNome() + ", " + atual.getIdade() + ", " + atual.getEspecie() + ", " + atual.getRaca() + ", " + atual.getPerfil() + ", " + atual.getStatus());
            //System.out.println("Primeiro nó: " + firstNode.getData());
            //System.out.println("último nó: " + lastNode.getData());
            atual = atual.getNextNode();
        }
    }
}    
