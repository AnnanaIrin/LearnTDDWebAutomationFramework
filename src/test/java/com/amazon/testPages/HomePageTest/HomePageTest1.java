package com.amazon.testPages.HomePageTest;

import com.amazon.pages.HomePage;
import com.amazon.pages.HomePage1;
import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.amazon.pageElement.HomePageElements.verifySearchProductWebElement;

public class HomePageTest1 extends WebTestBase {
    HomePage1 homePage1;


//   @Test(enabled = false)
//   @Ignore
//    public void practiceVerifySearchProductUsingValidProductName(){
//
//       //Action method
//       //Object
//       HomePage homePage=new HomePage(driver);
//
//       homePage.searchProductUsingValidProductName();
//
//        // Verification method
//
//            String expectedProductName="\"tide pods\"";
//            String actualProductName=driver.findElement(By.xpath(verifySearchProductWebElement)).getText();
//            Assert.assertEquals(actualProductName,expectedProductName,"Product name doesn't match");
//
//
//    }

    @Test(enabled = true)
    public void practiceVerifySearchProductUsingValidProductName1(){
        homePage1=new HomePage1();


        //Action method
       homePage1.searchProductUsingValidProductName();

        // Verification method

        String expectedProductName= "\"tide pods\"";
        String actualProductName=driver.findElement(By.xpath(verifySearchProductWebElement)).getText();
        Assert.assertEquals(actualProductName,expectedProductName,"Product name doesn't match");


    }

    @Test(enabled = true)
    public void practiceVerifySearchProductUsingValidProductName5(){
        homePage1=new HomePage1();


        //Action method
        homePage1.searchProductUsingValidProductName();

        // Verification method

        String expectedProductName= "\"tide pods\"";
        String actualProductName=driver.findElement(By.xpath(verifySearchProductWebElement)).getText();
        Assert.assertEquals(actualProductName,expectedProductName,"Product name doesn't match");


    }
}
