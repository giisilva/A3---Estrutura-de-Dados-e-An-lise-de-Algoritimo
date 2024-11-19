package ListaDupLigada;
//import ListaDupLigada.Node;
public class ListaPet {
    private Node firstNode;
    private Node lastNode;
    private Node nextNode;
    private Node prevNode;
    private String nome;
    
    public ListaPet(){
        this("lista");
    }
    
    public ListaPet(String listaPet){
        nome= listaPet;
        firstNode = lastNode = null;
    }
    
    public void addStart(String nomePet) {
        Node newNode = new Node(nomePet);

        if (firstNode == null) {
            firstNode = lastNode = newNode; // Se a lista está vazia, o novo nó se torna o head
        } else {
            firstNode.prevNode = newNode; // Conecta o primeiro nó ao novo nó
            newNode.nextNode = firstNode; // Conecta o novo nó ao antigo primeiro nó
            firstNode = newNode;         // Atualiza o último nó
        }

    }
    public void addEnd(String nomePet) {
        Node newNode = new Node(nomePet);
    
        if (firstNode == null) {
            firstNode = lastNode = newNode; // Se a lista está vazia, o novo nó se torna o head
        } else {
            lastNode.prevNode = newNode; // Conecta o último nó ao novo nó
            newNode.nextNode = lastNode; // Conecta o novo nó ao antigo último nó
            lastNode = newNode;         // Atualiza o último nó
        }
    }

    public boolean addMiddle(String key, String nomePet) {
        Node atual = firstNode;

        if (atual == null) {
            return false;
        }
            
        while (atual.getData()!=key) {
            atual = atual.getNextNode();
        }

        if (atual == null){
            return false;
        }

        Node newNode = new Node(nomePet);

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

    public void printLista() {
        if (firstNode == null) {
            System.out.println("A lista está vazia.");
            return; // Não tenta percorrer a lista se estiver vazia
        }

        Node atual = firstNode;
        while (atual != null) {
            System.out.println("Nó: " + atual.getData());
            atual = atual.getNextNode();
        }
    }
        /*verificar os nós
        System.out.println("Primeiro nó: " + firstNode.getData());
        System.out.println("último nó: " + lastNode.getData());
        System.out.println("próximo nó: " + nextNode.getData());
        System.out.println("nó anterior " + prevNode.getData());*/
}    
