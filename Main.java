import ListaDupLigada.ListaPet;
public class Main {
    public static void main(String[] args) {
        ListaPet lista = new ListaPet("Pets");
        lista.addStart("Milly");
        lista.addStart("Nila");
        lista.addEnd("Pandora");
        lista.addEnd("Zorro");
        lista.addStart("Max");
        lista.addMiddle("Nila", "Zelda");
        lista.addMiddle("Pandora", "Kiara");

        lista.printLista();
    }
}