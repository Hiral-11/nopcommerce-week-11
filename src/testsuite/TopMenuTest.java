package testsuite;

/**
 * Write down the following test into ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’ 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //Find and click on 'Computer' tab
        WebElement computersTab = driver.findElement(By.linkText("Computers"));
        computersTab.click();
        //Verify the text 'Computers'
        String expectedText = "Computers";
        //get text from computer tab
        computersTab = driver.findElement(By.linkText("Computers"));
        String actualText = computersTab.getText();
        System.out.println(actualText);
        //Validate actual and expected text
        Assert.assertEquals("Not navigate to 'Computers' Tab ", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Find and click on 'Electronics' Tab
        WebElement electronicsTab = driver.findElement(By.linkText("Electronics"));
        electronicsTab.click();
        //Verify the text 'Electronics'
        String expectedText = "Electronics";
        //get text from electronics tab
        electronicsTab = driver.findElement(By.linkText("Electronics"));
        String actualText = electronicsTab.getText();
        System.out.println(actualText);
        //Validate actual and expected text
        Assert.assertEquals("Not navigate to'Electronics' Tab", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //Find and click on 'Apparel' Tab
        WebElement electronicsTab = driver.findElement(By.linkText("Apparel"));
        electronicsTab.click();
        //Verify the text 'Apparel'
        String expectedText = "Apparel";
        //get text from Apparel tab
        electronicsTab = driver.findElement(By.linkText("Apparel"));
        String actualText = electronicsTab.getText();
        System.out.println(actualText);
        //Validate actual and expected text
        Assert.assertEquals("Not navigate to'Apparel' Tab", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //Find and click on 'Digital downloads' Tab
        WebElement electronicsTab = driver.findElement(By.linkText("Digital downloads"));
        electronicsTab.click();
        //Verify the text 'Digital downloads'
        String expectedText = "Digital downloads";
        //get text from Digital downloads tab
        electronicsTab = driver.findElement(By.linkText("Digital downloads"));
        String actualText = electronicsTab.getText();
        System.out.println(actualText);
        //Validate actual and expected text
        Assert.assertEquals("Not navigate to'Digital downloads' Tab", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //FInd and click on 'Books' tab
        WebElement booksTab = driver.findElement(By.xpath("//a[@href='/books']"));
        booksTab.click();
        String expectedText ="Books";
        //Get text from 'Books' tab
        booksTab = driver.findElement(By.xpath("//a[@href='/books']"));
        String actualText = booksTab.getText();
        System.out.println(actualText);
        //Verify the actual and expected text
        Assert.assertEquals("Not navigate to 'Books' Tab", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //FInd and click on 'Jewelry' tab
        WebElement jewelryTab = driver.findElement(By.xpath("//a[@href='/jewelry']"));
        jewelryTab.click();
        String expectedText = "Jewelry";
        //Get text from 'Jewelry' tab
       jewelryTab = driver.findElement(By.xpath("//a[@href='/jewelry']"));
        String actualText = jewelryTab.getText();
        System.out.println(actualText);
        //Verify the actual and expected text
        Assert.assertEquals("Not navigate to 'Jewelry' Tab", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //FInd and click on 'Gift Cards' tab
        WebElement giftCardsTab = driver.findElement(By.xpath("//a[@href='/gift-cards']"));
        giftCardsTab.click();
        String expectedText = "Gift Cards";
        //Get text from 'Gift Cards' tab
       giftCardsTab= driver.findElement(By.xpath("//a[@href='/gift-cards']"));
        String actualText = giftCardsTab.getText();
        System.out.println(actualText);
        //Verify the actual and expected text
        Assert.assertEquals("Not navigate to 'Gift Cards' Tab", expectedText, actualText);
    }
    @After
    public void tearDown(){
        closerBrowser();
    }

}
