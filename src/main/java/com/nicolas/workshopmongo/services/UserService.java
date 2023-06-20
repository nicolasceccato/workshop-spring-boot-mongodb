package com.nicolas.workshopmongo.services;

import com.nicolas.workshopmongo.domain.User;
import com.nicolas.workshopmongo.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    public List<User> findAll() {
        return repo.findAll();
    }
}
