package com.example.projetdevops2.Controller;

import com.example.projetdevops2.Service.UserService;
import com.example.projetdevops2.User.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService utilisateurService;

    public UserController(UserService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = utilisateurService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> getUsersById(@PathVariable("id") Long id){
        User utilisateurs = utilisateurService.findUsersById(id);
        return new ResponseEntity<>(utilisateurs, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User utilisateurs){
        User user = utilisateurService.findUsersByMail(utilisateurs.getMail());
        if(user.motdepasse.equals(utilisateurs.getMotdepasse())){
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return (ResponseEntity<User>) ResponseEntity.internalServerError();
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<User> addUsers(@RequestBody User utilisateurs){
        User newUtilisateurs = utilisateurService.addUsers(utilisateurs);
        return new ResponseEntity<>(newUtilisateurs, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUsers(@RequestBody User utilisateurs){
        User updateUtilisateurs = utilisateurService.updateUsers(utilisateurs);
        return new ResponseEntity<>(updateUtilisateurs, HttpStatus.OK);
    }
}
