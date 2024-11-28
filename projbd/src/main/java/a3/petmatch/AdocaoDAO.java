package a3.petmatch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AdocaoDAO {
    public void salvar(Adocao adocao) {
        String sql = "INSERT INTO adocoes (id_pet, id_adotante, data_adocao) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseConection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, adocao.getIdPet());
            stmt.setInt(2, adocao.getIdAdotante());
            stmt.setDate(3, java.sql.Date.valueOf(adocao.getDataAdocao()));
            stmt.executeUpdate();
            System.out.println("Adoção salva com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao salvar adoção: " + e.getMessage());
        }
    }

    public List<Adocao> listar() {
        String sql = "SELECT * FROM adocoes";
        List<Adocao> adocoes = new ArrayList<>();
        try (Connection connection = DatabaseConection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Adocao adocao = new Adocao(
                    rs.getInt("id_adocao"),
                    rs.getInt("id_pet"),
                    rs.getInt("id_adotante"),
                    rs.getDate("data_adocao").toLocalDate()
                );
                adocoes.add(adocao);
            }
        } catch (Exception e) {
            System.err.println("Erro ao listar adoções: " + e.getMessage());
        }
        return adocoes;
    }
}
