package pages;

import io.cucumber.java.StepDefinitionAnnotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy (id="firstName")
    public WebElement firstNameField;

    @FindBy (id="middleName")
    public WebElement middleNameField;

    @FindBy (id="lastName")
    public WebElement lastNameField;

    @FindBy (id="btnSave")
    public WebElement saveButton;

    @FindBy (id="employeeId")
    public WebElement empIdLocator;

    @FindBy (id="photofile")
    public WebElement photograph;

    @FindBy (id="chkLogin")
    public WebElement checkBox;

    @FindBy(id="user_name")
    public WebElement createUSername;

    @FindBy(id="user_password")
    public WebElement createPassword;

    @FindBy(id="re_password")
    public WebElement confirmPassword;

    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }
}