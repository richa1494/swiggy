package PageObjectRep;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

public class Swiggy {
    WebDriver driver;

    public Swiggy(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@class='_381fS _1oTLG _3BIgv']")
    @CacheLookup
    WebElement location_path;
    String Location="Indiranagar, Bengaluru, Karnataka, India";
    @FindBy(xpath = ".//span[text()='Indiranagar, Bengaluru, Karnataka, India']")
    @CacheLookup
    WebElement loc;

   /* @FindBy(xpath = ".//span[text()='FIND FOOD']")
    @CacheLookup
    WebElement findfood;*/

    @FindBy(xpath = ".//*[@href='/search']")
    @CacheLookup
    WebElement search;

    @FindBy(xpath = ".//*[@class='_2BJMh'][@placeholder='Search for restaurants or dishes']")
    @CacheLookup
    WebElement restaurant;

    @FindBy(xpath = ".//*[@class='_2BJMh'][@placeholder='Search for restaurants or dishes']")
    @CacheLookup
    WebElement bakary_test;

    @FindBy(xpath = ".//*[@href='/bangalore/bite-me-cupcakes-100-feet-road-indiranagar']")
    @CacheLookup
    WebElement address;

    @FindBy(xpath = ".//*[@class='_16j1h']//a[@href='/bangalore/bite-me-cupcakes-100-feet-road-indiranagar']")
    @CacheLookup
    WebElement link;

    @FindBy(xpath = ".//div[@class='JWyJG']/div[2][1]")
    @CacheLookup
    WebElement add;
    //@FindBy(how= How.LINK_TEXT,using="Lost your password?")
    //@CacheLookup
    //WebElement forget_password_link;
    public void navigateTo_AppLogin() {
        driver.get(managers.FileReader.getInstance().getConfigReader().getApplicationUrl());
    }

    public void select_location(){
        String location= managers.FileReader.getInstance().getConfigReader().getLocation();
        location_path.sendKeys(location);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loc.click();
        //findfood.click();

    }

    public void search(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        search.click();

    }

    public void res(){
        String resturdent= managers.FileReader.getInstance().getConfigReader().getRestaurant();
        restaurant.sendKeys(resturdent);

    }

    public void bakary(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bakary_test.click();

    }

    public void address(){
        address.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        link.click();
    }

    public void add(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

        // This  will scroll down the page by  1000 pixel vertical
        js.executeScript("window.scrollBy(0,1000)");
        add.click();
}}