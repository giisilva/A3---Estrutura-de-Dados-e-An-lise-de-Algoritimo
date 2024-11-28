package a3.petmatch;

public class Pet {
    private int id_pet;
    private String nome;
    private int idade;
    private String especie;
    private String raca;
    private String perfil;
    private String status;
    private int idOng; // ID da ONG que cadastrou o pet

    public Pet(int id, String nome, int idade, String especie, String raca, String perfil, String status, int idOng) {
        this.id_pet = id;
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.raca = raca;
        this.perfil = perfil;
        this.status = status;
        this.idOng = idOng;
    }

    // Getters e Setters
    public int getId() { return id_pet; }
    public void setId(int id) { this.id_pet = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    public String getPerfil() { return perfil; }
    public void setPerfil(String perfil) { this.perfil = perfil; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public int getIdOng() { return idOng; }
    public void setIdOng(int idOng) { this.idOng = idOng; }
}
