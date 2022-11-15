package useCases;
import entities.RegisteredUser;


public class UserFactory extends InMemoryUserRepository{


    private UserFactory(){

    }
    public static RegisteredUser createAccount(String id, String password,
                                        String first, String last, String email){
        RegisteredUser user = new RegisteredUser(id, password, first, last, email);
        UserFactory.create(user);
        return user;
        //code to add the user to the repository
        //
        //


    }



}
