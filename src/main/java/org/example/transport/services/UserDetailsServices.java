package org.example.transport.services;

import org.example.transport.entities.UserDetails;
import org.example.transport.repositories.UserDetailsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServices {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserDetailsServices.class);

    public UserDetailsServices() {
        logger.info(getClass().getSimpleName() + " created");
    }

    public List<UserDetails> getAllUserDetails() {
        return userDetailsRepository.findAll();
    }

    public UserDetails getUserDetails(Integer userId) {
        return userDetailsRepository.getOne(userId);
    }

    public void saveUser(UserDetails userDetails) {
        userDetailsRepository.save(userDetails);
    }

    public void deleteUser(Integer userId) {
        UserDetails userDetails = userDetailsRepository.getOne(userId);
        userDetails.setUserStatusId(4);
        userDetailsRepository.save(userDetails);
    }
}
