package a3.petmatch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PetDAO {
    // Método para salvar um pet no banco de dados
    public void salvar(Pet pet) {
        String sql = "INSERT INTO pets (nome, idade, especie, raca, perfil, status, id_ong) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, pet.getNome());
            stmt.setInt(2, pet.getIdade());
            stmt.setString(3, pet.getEspecie());
            stmt.setString(4, pet.getRaca());
            stmt.setString(5, pet.getPerfil());
            stmt.setString(6, pet.getStatus());
            stmt.setInt(7, pet.getIdOng());
            stmt.executeUpdate();
            System.out.println("Pet salvo com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao salvar pet: " + e.getMessage());
        }
    }

    // Método para listar todos os pets do banco de dados
    public List<Pet> listar() {
        String sql = "SELECT * FROM pets";
        List<Pet> pets = new ArrayList<>();
        try (Connection connection = DatabaseConection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Pet pet = new Pet(
                    rs.getInt("id_pet"),
                    rs.getString("nome"),
                    rs.getInt("idade"),
                    rs.getString("especie"),
                    rs.getString("raca"),
                    rs.getString("perfil"),
                    rs.getString("status"),
                    rs.getInt("id_ong")
                );
                pets.add(pet);
            }
        } catch (Exception e) {
            System.err.println("Erro ao listar pets: " + e.getMessage());
        }
        return pets;
    }
}
