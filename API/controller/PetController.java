package com.example.pets.controller;

import com.example.pets.model.PetRequest;
import ListaDupLigada.ListaPet; // Importando sua classe existente
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    private ListaPet listaPet = new ListaPet();

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarPet(@RequestBody PetRequest petRequest) {
        listaPet.addEnd(
            petRequest.getNome(),
            petRequest.getIdade(),
            petRequest.getEspecie(),
            petRequest.getRaca(),
            petRequest.getPerfil(),
            petRequest.getStatus()
        );
        return ResponseEntity.ok("Pet cadastrado com sucesso!");
    }
}
