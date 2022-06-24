package com.example.projetdevops2.Service;

import com.example.projetdevops2.Repository.UserRepository;
import com.example.projetdevops2.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository utilisateurRepository;
    @Autowired
    public UserService(UserRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
    public User addUsers(User utilisateurs){ // a utiliser pour l'import à partir du fichier csv
        return utilisateurRepository.save(utilisateurs);
    }
    public List<User> findAllUsers(){
        return utilisateurRepository.findAll();
    }
    public User updateUsers(User utilisateurs){
        return utilisateurRepository.save(utilisateurs);
    }
    public User findUsersById(Long id){for(User u:findAllUsers()){if(u.getId()==id){return u;}}return null;}
    public User findUsersByMail(String mail){for(User u:findAllUsers()){if(u.getMail()==mail){return u;}}return null;}
}
