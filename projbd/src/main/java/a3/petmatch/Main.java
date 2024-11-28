package a3.petmatch;

import  java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        PetDAO petDAO = new PetDAO();
        AdocaoDAO adocaoDAO = new AdocaoDAO();

        // Salvar (USUARIO / PET / ADOCAO)
        Usuario usuario = new Usuario(0, "Gi", "gios@gmail.com.br", "4444", " 123456789", "adotante", "rua linda");
        usuarioDAO.salvar(usuario);

        Pet pet = new Pet(0, "floquinho", 5, "OUTRO", "coelho", "dorminhoco", "disponível", 1);
        petDAO.salvar(pet);

        Adocao novaAdocao = new Adocao(0, 2, 2, LocalDate.now());
        adocaoDAO.salvar(novaAdocao);

        // Listar (USUARIO / PET / ADOCAO)
        List<Usuario> usuarios = usuarioDAO.listar();
        for (Usuario u : usuarios) {
            System.out.println(
            "ID: " + u.getIdUsuario() + 
            ", Nome: " + u.getNome() + 
            ", Email: " + u.getEmail() +
            ", Telefone: " + usuario.getTelefone() +
            ", Tipo: " + usuario.getTipo() +
            ", Endereço: " + usuario.getEndereco());
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