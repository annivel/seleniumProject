package helpesr;

import pages.LoginPage;
import users.User;


public class LoginHelper extends LoginPage {
    public void login(String login, String password) {
        setInputLogin(login);
        setInputPassword(password);
        setBtmLogin();
    }

    public void login(User user) {
        log.info(String.format("Login user name - %s , password - %s .", user.userName, user.password));
        login(user.userName, user.password);
    }
}
