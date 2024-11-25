import ListaDupLigada.ListaPet;
import Fila.Fila;
public class Main {
    public static void main(String[] args) {
        ListaPet lista = new ListaPet("Pets");
        lista.addStart("Milly");
        lista.addStart("Nila");
        lista.addEnd("Pandora");
        lista.addEnd("Zorro");
        lista.addStart("Maxwell");
        lista.addMiddle("Milly", "Nick");
        lista.addMiddle("Zorro", "Kiara");

        lista.printLista();

        Fila fila = new Fila();
        fila.addFila("Vanessa");
        fila.addFila("Fernando");
        fila.addFila("Trinity");
        
        System.out.println("Fila: ");
        fila.printFila();

        while(!fila.isEmpty()){
            System.out.println("Removendo:" + fila.removeFila());
        }
    }
}