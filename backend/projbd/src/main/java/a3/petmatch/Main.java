package a3.petmatch;

import java.util.List;

import a3.petmatch.Fila.Fila;
import a3.petmatch.ListaDupLigada.ListaPet;

import java.time.LocalDate;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        PetDAO petDAO = new PetDAO();
        AdocaoDAO adocaoDAO = new AdocaoDAO();

        // Salvar (USUARIO / PET / ADOCAO)
        try {
            Usuario usuario = new Usuario(0, "Adriano", "adriano@gmail.com.br", "1111", " 123456", "ONG",
                    "rua linda");
            usuarioDAO.salvar(usuario);

            /*
             * Pet pet = new Pet(0, "Jully", 5, "GATO", "PELADO", "fofinho", "adotado", 1,
             * Files.readAllBytes(Paths.get(
             * "C:\\Users\\POPULIS\\Desktop\\00_FACULDADE\\6ªSEM\\pets_geral.png"))); //
             * ..\login\Login.html
             * petDAO.salvar(pet);
             */

            Adocao novaAdocao = new Adocao(0, 2, 2, LocalDate.now());
            adocaoDAO.salvar(novaAdocao);

        } catch (Exception e) {
            System.err.println("Erro durante execução: " + e.getMessage());
        }
        // Listar (USUARIO / PET / ADOCAO)
        List<Usuario> usuarios = usuarioDAO.listar();
        for (Usuario u : usuarios) {
            System.out.println(
                    "ID: " + u.getIdUsuario() +
                            ", Nome: " + u.getNome() +
                            ", Email: " + u.getEmail() +
                            ", Telefone: " + u.getTelefone() +
                            ", Tipo: " + u.getTipo() +
                            ", Endereço: " + u.getEndereco());
        }

        List<Pet> pets = petDAO.listar();
        for (Pet p : pets) {
            System.out.println(
                    "ID: " + p.getId() +
                            ", Nome: " + p.getNome() +
                            ", Idade: " + p.getIdade() +
                            ", Espécie: " + p.getEspecie() +
                            ", Raça: " + p.getRaca() +
                            ", Perfil: " + p.getPerfil() +
                            ", Status: " + p.getStatus() +
                            ", ID ONG: " + p.getIdOng());
            try {
                Files.createDirectories(Paths.get("output"));

                if (p.getFoto() != null) {
                    Files.write(Paths.get("output/" + p.getNome() + ".jpg"), p.getFoto());
                    System.out.println("Foto salva em: output/" + p.getNome() + ".jpg");
                } else {
                    System.out.println("Foto não disponível para o pet: " + p.getNome());
                }
            } catch (Exception e) {
                System.err.println("Erro ao salvar foto: " + e.getMessage());
            }
        }

        List<Adocao> adocoes = adocaoDAO.listar();
        for (Adocao adocao : adocoes) {
            System.out.println(
                    "ID Adoção: " + adocao.getIdAdocao() +
                            ", ID Pet: " + adocao.getIdPet() +
                            ", ID Adotante: " + adocao.getIdAdotante() +
                            ", Data: " + adocao.getDataAdocao());
        }

        ListaPet lista = new ListaPet("Pets");
        lista.addStart("Mike", 4, "cachorro", "Vira-Lata", "cachorro porte médio, dócil e animado", "disponivel");

        lista.addEnd("Amora", 2, "Gato", "Vira-Lata", "Gato filhote, travessa e gentil", "Disponível" );

        lista.addMiddle("Mike", "Luna", 5, "Cachorro", "Vira-Lata", "Cachorro porte médio, dócil e animado", "Disponível");


        System.out.println("lista na ordem: ");
        lista.printLista();

        lista.removeMiddle("Mike");
        System.out.println("lista na ordem: ");
        lista.printLista();

        lista.removeStart();
        System.out.println("lista na ordem: ");
        lista.printLista();
                
        lista.removeEnd();
        System.out.println("lista na ordem: ");
        lista.printLista();

        Fila fila = new Fila();
        fila.addFila("João Silva", "joaosilva@gmail.com.br", "1111", "123456", "Rua Espanha" );
        fila.addFila("Maria Oliveira", "mariaoliveira@gmail.com.br", "1222", "723452", "Rua Maria Tomásia" );
        fila.addFila("Pedro Costa", "pedrocosta@gmail.com.br", "1333", "849056", "Rua Rui Barbosa" );
        fila.addFila("Ana Souza", "anasouza@gmail.com.br", "1444", "915761", "Rua Camilo de Matos" );
        
        System.out.println("Fila: ");
        fila.printFila();

        while(!fila.isEmpty()){
            System.out.println("Removendo: " + fila.removeFila());
        }
    }
}