package a3.petmatch;

public class Usuario {
        private int id_usuario;
        private String nome;
        private String email;
        private String senha;
        private String telefone; 
        private String tipo;     // (ONG ou Adotante)
        private String endereco; 

        public Usuario(int id_usuario, String nome, String email, String senha, String telefone, String tipo, String endereco) {
            this.id_usuario = id_usuario;
            this.nome = nome;
            this.email = email;
            this.senha = senha;
            this.telefone = telefone;
            this.tipo = tipo;
            this.endereco = endereco;
        }

        public int getIdUsuario() { return id_usuario; }
        public void getIdUsuario(int id_usuario) { this.id_usuario = id_usuario; }

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getSenha() { return senha; }
        public void setSenha(String senha) { this.senha = senha; }

        public String getTelefone() { return telefone; }
        public void setTelefone(String telefone) { this.telefone = telefone; }

        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }

        public String getEndereco() { return endereco; }
        public void setEndereco(String endereco) { this.endereco = endereco; }

        @Override
        public String toString() {
            return 
            "Client [id=" + id_usuario + ", name=" + nome + ", email=" + email + "senha= " + senha + 
            ", telefone="  + telefone + ", tipo=" + tipo + ", endereco =" + endereco + "]";
        }       
}

