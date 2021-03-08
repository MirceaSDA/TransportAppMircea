package org.example.transport.services;

import org.example.transport.entities.Users;
import org.example.transport.repositories.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UsersRepository usersRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserServices.class);

    public UserServices() {
        logger.info(getClass().getSimpleName() + " created");
    }

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public Users getUser(String username) {
        return usersRepository.getOne(username);
    }

    public void saveUser(Users users) {
        usersRepository.save(users);
    }

    public void deleteUser(String username) {
        Users users = usersRepository.getOne(username);
        users.setEnabled(false);
        usersRepository.save(users);
    }
}
