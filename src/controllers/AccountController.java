package controllers;

import useCases.UserCreatorInputBoundary;
import useCases.UserInputData;
import useCases.UserManager;
//temporarily to run code
import entities.RegisteredUser;
import java.util.ArrayList;

/**
 * Controller is to pass the username, password and passwordShadow required by the UserManager,
 * and then to run the usercase through the UserCreatorInputBoundary Interface.
 */



public class AccountController {

    final UserCreatorInputBoundary data;

    public AccountController(UserCreatorInputBoundary data) {
        this.data = data;

    }
    UserInputData create(String username, String password, String passwordShadow){
        UserInputData userShell = new UserInputData(username, password, passwordShadow);

        return userShell;
    }



}
