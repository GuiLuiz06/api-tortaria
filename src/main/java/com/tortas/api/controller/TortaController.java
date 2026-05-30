package com.tortas.api.controller;

import com.tortas.api.model.Torta;
import com.tortas.api.repository.TortaRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
@CrossOrigin("*")
public class TortaController {

    private final TortaRepository repository;

    public TortaController(TortaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Torta> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Torta salvar(@RequestBody Torta torta) {
        return repository.save(torta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}