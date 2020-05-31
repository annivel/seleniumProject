package tests;

import com.it.App;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import users.User;
import users.UserFactory;

public class BaseTest {
    protected App app = new App();
    protected User validUser = UserFactory.getValidUser();

    @BeforeSuite
    public void beforeSuit() {
    }

    @AfterSuite
    public void afterSuit() {
        app.common.appStop();
    }
}
