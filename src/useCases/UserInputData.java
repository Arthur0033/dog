package useCases;

import controllers.AccountController;

public class UserInputData{
    private String username;
    private String password;
    private String passwordShadow;
    private String email;
    private String firstName;
    private String lastName;



    public UserInputData(String id, String p1, String p2, String first, String last, String email) {
        this.username = id;
        this.password = p1;
        this.passwordShadow = p2;
        this.firstName = first;
        this.lastName = last;
        this.email = email;



    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getPasswordShadow(){return this.passwordShadow;}
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){return this.lastName;}
    public String getEmail(){
        return this.email;
    }
}
