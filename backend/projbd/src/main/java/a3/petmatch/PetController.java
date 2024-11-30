package a3.petmatch;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pets") // Define o endpoint principal do recurso Pet
public class PetController {

    private final PetDAO petDAO; // Injeta o DAO responsável por salvar os pets

    public PetController(PetDAO petDAO) {
        this.petDAO = petDAO; // Inicializa o DAO através do construtor
    }

    @PostMapping
    public ResponseEntity<String> salvarPet(@RequestBody Pet pet) {
        try {
            petDAO.salvar(pet); // Chama o DAO para salvar o pet no banco de dados
            return ResponseEntity.ok("Pet salvo com sucesso!"); // Retorna uma mensagem de sucesso
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao salvar pet: " + e.getMessage()); // Retorna uma mensagem de erro
        }
    }
}
