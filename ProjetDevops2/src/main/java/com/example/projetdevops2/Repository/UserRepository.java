package com.example.projetdevops2.Repository;
import com.example.projetdevops2.Service.UserService;
import com.example.projetdevops2.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    void deleteUsersById(Long id);

    Optional<User> findUsersById(Long id);

    Optional<User> findUsersByMail(String mail);


}
