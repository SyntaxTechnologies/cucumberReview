package Steps;

import Utils.commonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class addEmployeeSteps extends commonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
       doClick(dash.PIMOption);
    }
    @When("user clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {
        doClick(addEmp.addEmpBtn);

    }
    @When("user starts adding the employee")
    public void user_starts_adding_the_employee(DataTable dataTable) {
//        get the data in maps
        List<Map<String, String>> employeesNames = dataTable.asMaps();

        for(Map<String,String>employee:employeesNames){

            String fname=employee.get("firstName");
            String mName=employee.get("middleName");
            String lastName=employee.get("lastName");


        }
    }

}
//8:20