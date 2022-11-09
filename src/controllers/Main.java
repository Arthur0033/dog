package controllers;

import controllers.AccountController;
import entities.RegisteredUser;
import useCases.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test Account creation");

        ArrayList<RegisteredUser> accounts = new ArrayList<>();


        String username = "Arthur";
        String password = "123";
        String password2 = "123";
        UserCreatorInputBoundary data = new UserManager(username, password, password2);
        AccountController start = new AccountController(data);
        UserInputData user = start.create(username, password, password2);

        //presenter receives this data and returns the Username, along with successful creation message
        start.data.create(user, accounts);

    }
}