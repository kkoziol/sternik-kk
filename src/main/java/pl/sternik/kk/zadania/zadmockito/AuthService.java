package pl.sternik.kk.zadania.zadmockito;

public class AuthService {
    private UserService userService;

    public AuthService(UserService userService) {
        this.userService = userService;

    }

    public boolean checkCredentials(String userName, String password) {
        String user = userService.findByName(userName);
        if (user != null && !"null".equals(user)) {
            return true;
        }
        return false;
    }
}
