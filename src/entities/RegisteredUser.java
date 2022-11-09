package entities;

public class RegisteredUser extends User{

    private String id;
    private String password;


    public RegisteredUser(final String id, final String password) {
        this.id = id;

        this.password = password;


    }
    public String getUsername(){
        return this.id;
    }
    public String getPassword(){
        return this.password;
    }
}
