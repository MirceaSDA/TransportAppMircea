package org.example.transport.controller;

import org.example.transport.entities.UserDetails;
import org.example.transport.entities.Users;
import org.example.transport.services.UserDetailsServices;
import org.example.transport.services.UserServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserServices userServices;

    @Autowired
    private UserDetailsServices userDetailsServices;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    public UserController() {
        logger.info(getClass().getSimpleName() + " created");
    }

    @GetMapping("/frontpage")
    public ModelAndView getLogin() {
        ModelAndView modelAndView = new ModelAndView("frontpage");
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView postLogin() {
        ModelAndView modelAndView = new ModelAndView("frontpage");
        return modelAndView;
    }

    @GetMapping("/403")
    public ModelAndView showErrorLogin() {
        ModelAndView modelAndView = new ModelAndView("f403");
        return modelAndView;
    }

    @GetMapping("/users")
    public ModelAndView getUsers() {
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("users", userServices.getAllUsers());
        modelAndView.addObject("users", userDetailsServices.getAllUserDetails());
        return modelAndView;
    }

    @GetMapping("/editUser/{id}")
    public ModelAndView editUser(@PathVariable String username) {
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("register", userServices.getUser(username));
        return modelAndView;
    }

    @GetMapping("/deleteUser/{id}")
    public ModelAndView deleteUser(@PathVariable String username) {
        ModelAndView modelAndView = new ModelAndView("redirect:/index");
        userServices.deleteUser(username);
        return modelAndView;
    }

//    @GetMapping("/addUser")
//    public ModelAndView addUser() {
//        ModelAndView modelAndView = new ModelAndView("user");
//        modelAndView.addObject("user", new Users());
//        return modelAndView;
//    }
//
//    @PostMapping("/saveUser")
//    public ModelAndView saveUser(@Valid @ModelAttribute("user") Users users, BindingResult bindingResult) {
//        ModelAndView modelAndView = new ModelAndView("redirect:/users");
//        if(bindingResult.hasErrors()) {
//            modelAndView.addObject("user", users);
//            modelAndView.setViewName("user");
//            return modelAndView;
//        }
//        users.setEnabled(true);
//        userServices.saveUser(users);
//        return modelAndView;
//    }
}
