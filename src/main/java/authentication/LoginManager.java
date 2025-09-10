package authentication;

public class LoginManager {
    private final AuthService authService;

    public LoginManager(AuthService authService) {
        this.authService = authService;
    }

    public String login(String userName, String password){
        if (authService.authenticate(userName, password)){
            return "Login sucessful";
        } else {
            return "Login failed";
        }
    }

}
