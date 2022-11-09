package useCases;
import entities.RegisteredUser;


public class UserFactory {


    public RegisteredUser createAccount(String username, String password){
        RegisteredUser user = new RegisteredUser(username, password);
        return user;
        //code to add the user to the repository
        //
        //

    }

}
