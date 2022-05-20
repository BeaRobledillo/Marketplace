package com.example.marketplace.service;

import com.example.marketplace.Entity.Vespa;
import com.example.marketplace.Entity.User;

import java.util.List;

public interface IUserService {
    public List<User> findAll();
    public void save(User users);

    public User findById(Long id);
    public void delete(Long id);
    List<Vespa> listVespa();
    public User findByUsername(String username);
}
