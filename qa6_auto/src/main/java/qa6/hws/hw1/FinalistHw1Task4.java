package qa6.hws.hw1;

import org.openqa.selenium.By;
// import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;

import qa6.driverFactory.DriverSetUp;

public class FinalistHw1Task4 {

    /*
    Write a program that will repeat the actions in the video
    “HW_AUTOMATION_LESSON_3_UPDATE.mp4”.
    http://www.automationpractice.pl/index.php
    */

    
    /* 
    public static void acceptCookies(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        WebElement acceptCookies = driver.findElement(Locators.acceptCookies);
        acceptCookies.click();
        Thread.sleep(5000);
    }
    */
    
    private static class Url {
        private static final String autoPractice = "http://www.automationpractice.pl/index.php";
    }

    private static class Locators {
        // private static final By acceptCookies = By.id("");
        private static final By searchField = By.id("search_query_top");
        private static final By searchButton = By.name("submit_search");
        private static final By resultSearchItem1 = By.xpath("(//a[@title='Printed Chiffon Dress'])[2]");
        private static final By addItemToCart = By.name("Submit");
        private static final By buttonContinue = By.xpath("//span[@title='Continue shopping']");
        private static final By navItem1 = By.xpath("(//a[@title='Women'])[1]");
        private static final By resultSearchItem2 = By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]");
        private static final By cart = By.xpath("//a[@title='View my shopping cart']");
    }
    
    private static class Data {
        private static final String inputForSearch1 = "Printed Chiffon Dress";
        private static final String inputForSearch2 = "Faded Short";
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get(Url.autoPractice);

        /*
        try {
            acceptCookies(driver);
        } catch (NoSuchElementException e) {
            System.out.println("Cookies not found");
        }
        */
        
        driver.findElement(Locators.searchField).sendKeys(Data.inputForSearch1);
        Thread.sleep(4000);
        driver.findElement(Locators.searchButton).click();
        Thread.sleep(4000);
        driver.findElement(Locators.resultSearchItem1).click();
        Thread.sleep(4000);
        driver.findElement(Locators.addItemToCart).click();
        Thread.sleep(4000);
        driver.findElement(Locators.buttonContinue).click();
        Thread.sleep(4000);
        driver.findElement(Locators.navItem1).click();
        Thread.sleep(4000);

        driver.findElement(Locators.searchField).sendKeys(Data.inputForSearch2);
        Thread.sleep(4000);
        driver.findElement(Locators.searchButton).click();
        Thread.sleep(4000);
        driver.findElement(Locators.resultSearchItem2).click();
        Thread.sleep(4000);
        driver.findElement(Locators.addItemToCart).click();
        Thread.sleep(4000);
        driver.findElement(Locators.buttonContinue).click();
        Thread.sleep(4000);
        driver.findElement(Locators.cart).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
