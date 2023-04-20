package Pages;

import Utils.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addEmployeePage extends commonMethods {
    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmpBtn;

    @FindBy(id = "firstName")
    public WebElement firstNameTextBox;

    @FindBy(id = "middleName")
    public WebElement middleNameTextBox;

    @FindBy(id = "lastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "btnSave")
    public WebElement saveBtn;


    public  addEmployeePage(){

        PageFactory.initElements(driver,this);
    }
}
