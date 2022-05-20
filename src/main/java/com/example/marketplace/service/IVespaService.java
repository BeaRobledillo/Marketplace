package com.example.marketplace.service;

import com.example.marketplace.Entity.Vespa;
import com.example.marketplace.Entity.User;

import java.util.List;

public interface IVespaService {
    public List<Vespa> findAll();
    public void save(Vespa vespa);

    public void findById(Long id);
    public void delete(Long id);
    List<User> listUser();
    public Vespa findByUsername(String username);
}
