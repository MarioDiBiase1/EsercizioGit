package it.begear.springTopBoot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.begear.springTopBoot.entities.User;
import it.begear.springTopBoot.repository.UserRepo;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public long countByName(String name) {
        return userRepo.countByName(name);
    }

    public List<User> findDistinctUsersByNameOrEmail(String name, String email) {
        return userRepo.findDistinctUsersByNameOrEmail(name, email);
    }

    public List<User> findByNameIgnoreCase(String name) {
        return userRepo.findByNameIgnoreCase(name);
    }

    public List<User> listAll() {
        return userRepo.findAll();
    }

    public void save(User user) {
        userRepo.save(user);
    }

    public User get(long id) {
        return userRepo.findById(id).orElse(null);
    }

    public void delete(long id) {
        userRepo.deleteById(id);
    }
}
