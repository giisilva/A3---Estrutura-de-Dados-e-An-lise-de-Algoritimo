package a3.petmatch;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    public void salvar(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, email, senha, telefone, tipo, endereco) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getTelefone());
            stmt.setString(5, usuario.getTipo());
            stmt.setString(6, usuario.getEndereco());
            stmt.executeUpdate();
            System.out.println("Usuário salvo com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao salvar usuário: " + e.getMessage());
        }
    }

    public List<Usuario> listar() {
        String sql = "SELECT * FROM usuarios";
        List<Usuario> usuarios = new ArrayList<>();
        try (Connection connection = DatabaseConection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Usuario usuario = new Usuario(
                    rs.getInt("id_usuario"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("senha"),
                    rs.getString("telefone"),
                    rs.getString("tipo"),
                    rs.getString("endereco")
                );
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.err.println("Erro ao listar usuários: " + e.getMessage());
        }
        return usuarios;
    }
}