package ListaDupLigada;
public class Node {
    public String Dado;
    public Node nextNode;
    public Node prevNode;
    
    public Node(String nomePet){
        this.Dado = nomePet;
        nextNode = null;
        prevNode = null;
    }
    
    public Node(String Dado, Node no){
        this.Dado = Dado;
        this.nextNode = no;
        this.prevNode = no;
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
    
    public String getData(){
        return Dado;
    }
    
    public void setData(String Dado){
        this.Dado = Dado;
    }
}
