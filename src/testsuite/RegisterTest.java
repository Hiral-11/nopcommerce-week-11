package testsuite;

/**
 * 5. Write down the following test into ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessfullly
 * click on the ‘Register’ link
 * Verify the text ‘Register’
 *2.user Should Register AccountSuccessfully *
 * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration completed’
 */

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Find and click on Register link
        WebElement registerLink = driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']"));
        registerLink.click();
        String expectedText ="Register";
        //get text from Register link
        registerLink = driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']"));
        String actualText = registerLink.getText();
        System.out.println(actualText);
        //Verify expected and actual text
        Assert.assertEquals("Not navigate to 'Registert' link", expectedText, actualText);
    }
@Test
    public void userSholdRegisterAccountSuccessfully() {
        //Find and click on Register link
    WebElement registerLink = driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']"));
    registerLink.click();
    //Find and select gender radio button and select / click on it
    WebElement genderRadioButton = driver.findElement(By.id("gender-female"));
    genderRadioButton.click();
    //Find First name fiels and Enter first name
    WebElement firstNameField = driver.findElement(By.id("FirstName"));
    firstNameField.sendKeys("A");
    //Find Last name field and last name
    WebElement lastNameField = driver.findElement(By.id("LastName"));
    lastNameField.sendKeys("B");
    //Find and selct Day Month and Year
    WebElement day = driver.findElement(By.name("DateOfBirthDay"));
    Select select = new Select(day);
    select.selectByVisibleText("1");
    WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
    Select select1 = new Select(month);
    select1.selectByVisibleText("January");
    WebElement year = driver.findElement(By.name("DateOfBirthYear"));
    Select select2 = new Select(year);
    select2.selectByVisibleText("2000");
    //Find email field and enter email address
    WebElement emailField = driver.findElement(By.id("Email"));
    emailField.sendKeys("testing@gmail.com");
    //Deselect the Newsletter option by clicking on it
    WebElement newsLetter = driver.findElement(By.id("Newsletter"));
    newsLetter.click();
    //Find passwordfield and enter password
    WebElement passwordField = driver.findElement(By.id("Password"));
    passwordField.sendKeys("Tester");
    //Find Confirmpassword field and enter password
    WebElement confirmpasswordField = driver.findElement(By.id("ConfirmPassword"));
    confirmpasswordField.sendKeys("Tester");
    //Find Register button and click on it
    WebElement registerButton = driver.findElement(By.id("register-button"));
    registerButton.click();
    String expectedText = "Your registration completed";
    //Get text post registration message
    WebElement registrationConfirmationMessage = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
    String actualText = registrationConfirmationMessage.getText();
    //verify expected and actual text matches
    Assert.assertEquals("Cant navigate to registartion confirmation page", expectedText, actualText);
    }
}
