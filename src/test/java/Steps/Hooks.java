package Steps;

import Utils.commonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends commonMethods {
    @Before
    public void preConditions() {

        openBrowserAndLaunchApplication();
    }

    @After
    public void postConditions() {
//        take screenshot
        closeBrowser();
    }
}


