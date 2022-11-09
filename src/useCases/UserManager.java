package useCases;

import entities.RegisteredUser;
import jdk.jfr.Registered;

import java.util.ArrayList;

public class UserManager implements UserCreatorInputBoundary{
    private String username;
    private String password;
    private String passwordShadow;
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

    public UserManager (String username, String password, String passwordShadow){
        this.username = username;
        this.password = password;
        this.passwordShadow = passwordShadow;

    }

    public UserManager (String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public UserManager create(UserInputData input, ArrayList<RegisteredUser> repo) {
        String id = input.getUsername();
        String password = input.getPassword();


        //if code works fix the password parameter
        if ((!(input.checkUserTaken(repo))) && ((input.checkPasswordMatch(input.getPassword(),
                input.getPasswordShadow())))){

            UserFactory user = new UserFactory();
            RegisteredUser account = user.createAccount(id, password);

            UserManager doger = new UserManager(id, password);

            return doger;
        }else {
            return null;
        }

    }

//    public RegisteredUser create(UserInputData input, ArrayList<RegisteredUser> repo) {
//        String id = input.getUsername();
//        String password = input.getPassword();
//
//
//        //if code works fix the password parameter
//        if ((!(input.checkUserTaken(repo))) && ((input.checkPasswordMatch(input.getPassword(),
//                input.getPasswordShadow())))){
//
//            UserFactory user = new UserFactory();
//            RegisteredUser account = user.createAccount(id, password);
//
//            return account;
//        }else {
//            return null;
//        }
//
//    }

}
