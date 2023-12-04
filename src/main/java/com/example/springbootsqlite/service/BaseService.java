package com.example.springbootsqlite.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<E>{

    E save(E entity);

    List<E> getAll();

    E update(E entity, Integer id);

    void deleteById(Integer id);
}
