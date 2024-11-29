package a3.petmatch;

import  java.util.List;
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
            Usuario usuario = new Usuario(0, "Gi", "giosr@gmail.com.br", "4444", " 123456789", "adotante", "rua linda");
            usuarioDAO.salvar(usuario);

            Pet pet = new Pet(0, "floquinho", 5, "OUTRO", "coelho", "dorminhoco", "disponível", 1, Files.readAllBytes(Paths.get("C:\\Users\\POPULIS\\Desktop\\00_FACULDADE\\6ªSEM\\pets_geral.png")));
            petDAO.salvar(pet);

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
                ", ID ONG: " + p.getIdOng()
            );
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
                ", Data: " + adocao.getDataAdocao()
            );
        }
    }
}