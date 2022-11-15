package controllers;

import controllers.AccountController;
import entities.RegisteredUser;
import useCases.*;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test Account creation");

        String username = "Arthur123";
        String password = "123";
        String firstName = "Arthur";
        String lastName = "dog";
        String password2 = "123";
        String email = "a@gmail.com";

        UserCreatorInputBoundary data = new UserManager(username, password, password2, firstName, lastName, email);
        AccountController accountController = new AccountController(data);
        UserInputData user = accountController.create(username, password, password2, firstName, lastName, email);

        //presenter receives this data and returns the Username, along with successful creation message
        accountController.data.create(user);
        System.out.println(InMemoryUserRepository.findByUsername("Arthur123"));
        System.out.println(InMemoryUserRepository.existsByUsername("Arthur123"));

    }
}