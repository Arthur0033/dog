package useCases;

import entities.RegisteredUser;
import jdk.jfr.Registered;
import useCases.UserChecker.*;

import java.util.ArrayList;

public class UserManager implements UserCreatorInputBoundary{
    private String username;
    private String password;
    private String passwordShadow;
    private String firstName;
    private String lastName;
    private String email;

    //public ArrayList<RegisteredUser> repo = new ArrayList<entities.RegisteredUser>();


    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getPasswordShadow(){
        return this.passwordShadow;
    }

    public UserManager (String username, String password, String passwordShadow, String first,
                        String last, String email){
        this.username = username;
        this.password = password;
        this.passwordShadow = passwordShadow;
        this.firstName = first;
        this.lastName = last;
        this.email = email;

    }
    public UserManager (String username, String password, String first,
                        String last, String email){
        this.username = username;
        this.password = password;
        this.firstName = first;
        this.lastName = last;
        this.email = email;

    }



    @Override
    public boolean create(UserInputData input) {
        String id = input.getUsername();
        String password = input.getPassword();
        String passwordShadow = input.getPasswordShadow();
        String email = input.getEmail();
        String firstName = input.getFirstName();
        String lastName = input.getLastName();


        //if code works fix the password parameter
        if (UserChecker.checkUserTaken(input)){
            return false;


        } else if (!(UserChecker.checkNullEntries(input))) {
            return false;

        } else if (!(UserChecker.checkPasswordMatch(password, passwordShadow))) {
            return false;


        } else {

            //creation of the account and added to the repository
            UserFactory.createAccount(id, password, firstName, lastName, email);

            return true;
        }

    }


}
