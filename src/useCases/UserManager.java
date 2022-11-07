package useCases;

public class UserManager implements UserCreatorInputBoundary{
    private String username;
    private String password;
    private String passwordShadow;

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getPasswordShadow(){
        return this.passwordShadow;
    }


}
