package com.example.springbootsqlite.controller;

import com.example.springbootsqlite.entity.Cliente;
import com.example.springbootsqlite.service.ClienteServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ClienteRestController {
    @Autowired
    private ClienteServiceImp clienteService;

    @PostMapping("/clientes")
    public Cliente saveCliente(@Validated @RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientesList(){
        return clienteService.getAll();
    }

    @PutMapping("/clientes/{id}")
    public Cliente updateCliente(@Validated @RequestBody Cliente cliente, @PathVariable("id") Integer id){
        return clienteService.update(cliente, id);
    }

    @DeleteMapping("/clientes/{id}")
    public String deleteClienteById(@PathVariable("id") Integer id){
        clienteService.deleteById(id);
        return "Eliminado correctamente";
    }
}
