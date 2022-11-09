package useCases;

import controllers.AccountController;
import entities.RegisteredUser;

import java.util.ArrayList;

public interface UserCreatorInputBoundary {

    /**
    the abstract method for user factory which will create
     */
    UserManager create(UserInputData input, ArrayList<RegisteredUser> repo);


}
