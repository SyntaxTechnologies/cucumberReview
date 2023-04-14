package Steps;

import Pages.LoginPage;

public class pageInitializers {

    public static LoginPage login;

    public static void initializePageObjects(){
        login=new LoginPage();
    }
}
