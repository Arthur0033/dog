package useCases;
import entities.RegisteredUser;

import java.util.ArrayList;

public class UserChecker {
    private String username;
    private String password;
    private String passwordShadow;

    public UserChecker(String id, String p1, String p2){
        this.username = id;
        this.password = p1;
        this.passwordShadow = p2;
    }
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getPasswordShadow(){
        return this.passwordShadow;
    }

    public boolean checkUserTaken(ArrayList<RegisteredUser> repo){
        for (RegisteredUser user : repo){
            if (user.getUsername().equals(this.username)){
                return true;
            }

        }
        return false;
    }
    public boolean checkPasswordMatch(String password1, String password2){
        return password1.equals(password2);
    }


}
