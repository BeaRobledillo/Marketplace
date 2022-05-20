package com.example.marketplace.service;

import com.example.marketplace.Entity.Vespa;
import com.example.marketplace.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImplements implements IUserService{


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User users) {

    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Vespa> listVespa() {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }
}
