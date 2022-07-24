package com.amazon.testPages.HomePageTest;

import com.amazon.pages.HomePage;
import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.amazon.pageElement.HomePageElements.*;
import static com.amazon.pages.HomePage.*;

public class HomePageTest extends WebTestBase {



   @Test(enabled = false)
   @Ignore
    public void practiceVerifySearchProductUsingValidProductName() throws InterruptedException {

       //Action method
       //Object
       HomePage homePage=new HomePage(driver);

       homePage.searchProductUsingValidProductName();

        // Verification method

            String expectedProductName="\"tide pods\"";
            String actualProductName=driver.findElement(By.xpath(verifySearchProductWebElement)).getText();
            Assert.assertEquals(actualProductName,expectedProductName,"Product name doesn't match");


    }

    @Test
    public void practiceVerifySearchProductUsingValidProductName1() throws InterruptedException {
        HomePage homePage=new HomePage(driver);
        //Action method
       homePage.searchProductUsingValidProductName();
        // Verification method
        String expectedProductName= "\"tide pods\"";
        String actualProductName=driver.findElement(By.xpath(verifySearchProductWebElement)).getText();
        Assert.assertEquals(actualProductName,expectedProductName,"Product name doesn't match");
    }

    @Test(enabled = true) @Ignore
    public void practiceVerifySearchProductUsingValidProductName6() throws InterruptedException {
       //Page class Object created and pass the WebTestBase class driver
        HomePage homePage=new HomePage(driver);


        //Action method
         homePage.searchProductUsingValidProductName();

        // Verification method

        String expectedProductName= "\"tide pods\"";
        String actualProductName=driver.findElement(By.xpath(verifySearchProductWebElement)).getText();
        Assert.assertEquals(actualProductName,expectedProductName,"Product name doesn't match");


    }
}
