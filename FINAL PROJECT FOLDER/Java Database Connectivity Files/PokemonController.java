package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PokemonController {
    
    @Autowired
    private JdbcPokemonRepository PokemonRepository;

    @GetMapping("/pokemon")
    public List<Pokemon> getAllPokemon() {
        return PokemonRepository.getAllPokemon();
    }
    
}
