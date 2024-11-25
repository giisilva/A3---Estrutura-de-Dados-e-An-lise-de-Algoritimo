package ListaDupLigada;
//import ListaDupLigada.Node;
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
    
    public void addStart(String nomePet) {
        Node newNode = new Node(nomePet);

        if (firstNode == null) {
            firstNode = lastNode = newNode; // Se a lista está vazia, ambos os nós recebem novo nó
        } else {
            newNode.setNextNode(firstNode); // o próximo nó se conecta ao que era o primeiro nó
            firstNode.setPrevNode(newNode); // o antigo primeiro nó aponta para o novo nó como anterior
            firstNode = newNode;         // Atualiza o primeiro nó
        }

    }
    public void addEnd(String nomePet) {
        Node newNode = new Node(nomePet);
    
        if (firstNode == null) {
            firstNode = lastNode = newNode; // Se a lista está vazia, ambos os nós recebem novo nó
        } else {
            newNode.setPrevNode(lastNode); // Conecta o último nó ao novo nó
            lastNode.setNextNode(newNode); // Conecta o novo nó ao antigo último nó
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
            if (atual == null){
            return false;
            }
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
        System.out.println("Lista: " + nome);
        if (firstNode == null) {
            System.out.println("A lista está vazia.");
            return; // Não tenta percorrer a lista se estiver vazia
        }

        Node atual = firstNode;
        while (atual != null) {
            System.out.println("Nó: " + atual.getData());
            System.out.println("Primeiro nó: " + firstNode.getData());
            System.out.println("último nó: " + lastNode.getData());
            atual = atual.getNextNode();
        }
    }
}    
