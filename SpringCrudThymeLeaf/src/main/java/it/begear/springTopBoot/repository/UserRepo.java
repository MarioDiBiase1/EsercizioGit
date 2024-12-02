package it.begear.springTopBoot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.begear.springTopBoot.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    long countByName(String name);
    List<User> findDistinctUsersByNameOrEmail(String name, String email);
    List<User> findByNameIgnoreCase(String name);
}
