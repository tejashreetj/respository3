package Assignment_14th_Feb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormFillUp {
    WebDriver driver;
    String URL = "https://demoqa.com";
    @BeforeMethod
    public void launchBrowser() throws Exception{
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//binaries//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }
    @Test
    public void nameField() throws Exception {
        driver.get(URL+"/automation-practice-form");
        Thread.sleep(1000);

        WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Tejashree");
        Thread.sleep(1000);

        WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Jalindre");
        Thread.sleep(1000);

        WebElement emailId=driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        emailId.sendKeys("tj@tj.com");
        Thread.sleep(1000);

        WebElement genderSelection=driver.findElement(By.xpath("//label[@class='custom-control-label' and contains(text(),'Female')]"));
        genderSelection.click();
        Thread.sleep(1000);
        WebElement chkbox1= driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        chkbox1.click();

        WebElement numberEnter=driver.findElement(By.xpath("//input[@id='userNumber']"));
        numberEnter.sendKeys("236236236");
        Thread.sleep(1000);

        WebElement dateOfBirth= driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        dateOfBirth.sendKeys("16 Nov 1992");
        Thread.sleep(1000);

        WebElement subjectContainer= driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        subjectContainer.sendKeys("I am happy to see its working fine!");
        Thread.sleep(3000);

        WebElement hobbiesSelect=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
        hobbiesSelect.click();
        Thread.sleep(1000);

        WebElement address= driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        address.sendKeys("123 Apt,456 Street");
        Thread.sleep(1000);

        JavascriptExecutor jScriptObj=(JavascriptExecutor) driver;
        jScriptObj.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement submitButton= driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
        Thread.sleep(1000);

//        WebElement selectFromDropDown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
//        //Here Select is a class of selenium and pass on the web element as a parameter in constructor of selenium class
//        Select ddl = new Select(ddl_color);
//        ddl.selectByVisibleText("Green");
//        Thread.sleep(3000);

//        WebElement chooseFile= driver.findElement(By.xpath("//input[@id='uploadPicture']"));
//        chooseFile.sendKeys("C:\\Users\\jalin\\Pictures\\Screenshots\\Screenshot(173).png");
//        chooseFile.getAttribute("Screenshot(174).png");
//        chooseFile.click();
//        Thread.sleep(5000);
//        WebElement uploadFile= driver.findElement(By.xpath("//input[@id='uploadPicture']"));
//        uploadFile.click();
//        Thread.sleep(5000);

// Upload a Picture
//        WebElement uploadOption = driver.findElement(By.id("uploadPicture"));
//        Actions actions1 = new Actions(driver);
//        actions1.moveToElement(uploadOption).build().perform();
//
//        uploadOption.sendKeys("C:\\Users\\Tanma\\eclipse-workspace\\QAbatch2020\\Game-Of-Thrones-Ultra-HD-4K-Wallpapers-34.jpg");
//        Thread.sleep(5000);

    }
    @AfterTest
    public void closeBrowser() throws Exception{
        driver.close();
    }

}
