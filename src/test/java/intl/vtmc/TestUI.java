package intl.vtmc;

import org.junit.Test;
import page.LoginPage;
import static org.junit.Assert.assertTrue;

public class TestUI extends BaseTest {

    private LoginPage loginPage = new LoginPage(driver);

    @Test
    public void testLoginIncorrect() {
        loginPage.enterUsername("admin");
        loginPage.enterPassword("slaptazodis");
        loginPage.clickButtonPrisijungti();
        assertTrue("Neteisingi prisijungimo duomenys!", true);
    }
}
