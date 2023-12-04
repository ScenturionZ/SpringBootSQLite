package com.example.springbootsqlite.service;

import com.example.springbootsqlite.entity.Cliente;
import com.example.springbootsqlite.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImp implements BaseService<Cliente>{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente save(Cliente entity) {
        return clienteRepository.save(entity);
    }

    @Override
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente update(Cliente entity, Integer id) {
        Cliente clienteDB = clienteRepository.getReferenceById(id);
        clienteDB.setMail(entity.getMail());
        clienteDB.setCuit(entity.getCuit());
        clienteDB.setRazonSocial(entity.getRazonSocial());
        return clienteRepository.save(clienteDB);
    }

    @Override
    public void deleteById(Integer id) {
        clienteRepository.deleteById(id);
    }
}
