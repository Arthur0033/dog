package useCases;

import controllers.AccountController;
import entities.RegisteredUser;

import java.util.ArrayList;

public interface UserCreatorInputBoundary {

    boolean create(UserInputData input);


}
