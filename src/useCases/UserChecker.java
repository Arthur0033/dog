package useCases;
import entities.RegisteredUser;

import java.util.ArrayList;
import java.util.Collection;

public class UserChecker {

    private UserChecker(){

    }

    public static boolean checkUserTaken(UserInputData userInput){
        ArrayList<RegisteredUser> allUsers = InMemoryUserRepository.findAllUsers();
        for (RegisteredUser user : allUsers){
            if (user.getUsername().equals(userInput.getUsername())){
                return true;
            }

        }
        return false;
    }
    public static boolean checkPasswordMatch(String password1, String password2){
        return password1.equals(password2);
    }
    public static boolean checkNullEntries(UserInputData userInput){
        if (userInput.getUsername() == null){
            return false;
        } else if (userInput.getPassword() == null) {
            return false;

        } else if (userInput.getPasswordShadow() == null) {
            return false;


        } else if (userInput.getFirstName() == null) {
            return false;

        } else if (userInput.getLastName() == null) {
            return false;
        } else return userInput.getEmail() != null;
    }


}
