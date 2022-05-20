package com.example.marketplace.service;

import com.example.marketplace.Entity.Vespa;
import com.example.marketplace.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VespaServiceImplements implements IVespaService {
    @Override
    public List<Vespa> findAll() {
        return null;
    }

    @Override
    public void save(Vespa cars) {

    }

    @Override
    public void findById(Long id) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<User> listUser() {
        return null;
    }

    @Override
    public Vespa findByUsername(String username) {
        return null;
    }
}
