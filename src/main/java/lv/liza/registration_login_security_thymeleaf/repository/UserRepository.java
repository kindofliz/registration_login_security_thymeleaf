package lv.liza.registration_login_security_thymeleaf.repository;

import lv.liza.registration_login_security_thymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This repository interface makes it possible to use database CRUD operations
 * for user jpa entity
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

}
