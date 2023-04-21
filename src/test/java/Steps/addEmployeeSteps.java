package Steps;

import Utils.ExcelReader;
import Utils.commonMethods;
import Utils.constants;
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
    public void user_starts_adding_the_employee(DataTable dataTable) throws InterruptedException {
//        get the data in maps
        List<Map<String, String>> employeesNames = dataTable.asMaps();

        for(Map<String,String>employee:employeesNames){

            String fname=employee.get("firstname");
            String mName=employee.get("middleName");
            String lastName=employee.get("lastName");
//            selenium operation
            sendText(addEmp.firstNameTextBox,fname);
            sendText(addEmp.lastNameTextBox,lastName);
            sendText(addEmp.middleNameTextBox,mName);
            doClick(addEmp.saveBtn);

            Thread.sleep(5000);
            doClick(addEmp.addEmpBtn);


        }
    }
    @When("user adds multiple employee from excel using {string} and verify it")
    public void user_adds_multiple_employee_from_excel_using_and_verify_it(String sheetName) {
        List<Map<String, String>> empFromExcel = ExcelReader.excelListIntoMap(constants.TESTDATA_FILEPATH, sheetName);
        for(Map<String,String>employee:empFromExcel) {

            String fname = employee.get("firstName");
            String mName = employee.get("middleName");
            String lastName = employee.get("lastName");

            System.out.println(fname);
            System.out.println(mName);
            System.out.println(lastName);
        }

    }

}
//8:20