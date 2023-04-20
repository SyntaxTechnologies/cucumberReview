package Steps;

import Pages.LoginPage;
import Pages.addEmployeePage;
import Pages.dashBoardPage;

public class pageInitializers {

    public static LoginPage login;
    public static addEmployeePage addEmp;
    public  static dashBoardPage dash;

    public static void initializePageObjects(){

        login=new LoginPage();
        addEmp=new addEmployeePage();
        dash=new dashBoardPage();
    }
}
