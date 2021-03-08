package org.example.transport.controller;

import org.example.transport.entities.AuthoritiesEntity;
import org.example.transport.entities.UserDetails;
import org.example.transport.entities.Users;
import org.example.transport.models.RegisterModel;
import org.example.transport.repositories.AuthoritiesRepository;
import org.example.transport.repositories.UserDetailsRepository;
import org.example.transport.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private AuthoritiesRepository authoritiesRepository;

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("frontpage");
        return modelAndView;
    }

    @GetMapping("/register")
    public ModelAndView register(){
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("registerModel", new RegisterModel());
        return modelAndView;
    }

    @PostMapping("/register-user")
    public ModelAndView registerUser(@ModelAttribute("registerModel") RegisterModel registerModel){
        Users user = new Users();
        user.setUsername(registerModel.getUsername());
        user.setPassword(passwordEncoder.encode(registerModel.getPassword()));
        user.setEnabled(true);
        AuthoritiesEntity authorities = new AuthoritiesEntity();
        authorities.setUsername(registerModel.getUsername());
        authorities.setAuthority("ROLE_USER");
        UserDetails userDetails = new UserDetails();
        userDetails.setName(registerModel.getName());
        userDetails.setSurname(registerModel.getSurname());
        userDetails.setUserStatusId(1);
        usersRepository.save(user);
        authoritiesRepository.save(authorities);
        userDetailsRepository.save(userDetails);
        ModelAndView modelAndView = new ModelAndView("redirect:/login");
        return modelAndView;
    }
}
