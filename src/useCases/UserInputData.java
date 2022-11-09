package useCases;

import controllers.AccountController;

public class UserInputData extends UserChecker{
    private String username;
    private String password;
    private String passwordShadow;


    public UserInputData(String id, String p1, String p2) {
        super(id, p1, p2);
    }
}
