package com.api.cadastro.controller;

import com.api.cadastro.model.Client;
import com.api.cadastro.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    private ClientRepository repository;

    @GetMapping
    public List<Client> findAll() {
        List<Client> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Client findById(@PathVariable String id) {
        Client result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Client insert(@RequestBody Client client) {
        Client result = repository.save(client);
        return result;
    }
}
