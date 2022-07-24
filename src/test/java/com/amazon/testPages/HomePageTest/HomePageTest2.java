package com.amazon.testPages.HomePageTest;

import com.amazon.pages.HomePage;
import com.amazon.pages.HomePage2;
import configuration.common.WebTestBase;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.amazon.pageElement.HomePageElements.verifySearchProductWebElement;

public class HomePageTest2 extends WebTestBase {
    HomePage2 homePage2;

    @BeforeMethod
    public void getInit(){
        homePage2= PageFactory.initElements(driver,HomePage2.class);

    }


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
   @Test (enabled = false)
   @Ignore

   public void practiceVerifySearchProductUsingValidProductName3() throws InterruptedException {

       //Action method
       //Object
       HomePage homePage=new HomePage(driver);

       homePage.searchProductUsingValidProductName();

        // Verification method

            String expectedProductName="\"tide pods\"";
            String actualProductName=driver.findElement(By.xpath(verifySearchProductWebElement)).getText();
            Thread.sleep(2000);
            Assert.assertEquals(actualProductName,expectedProductName,"Product name doesn't match");


    }

//    @Test
//    public void practiceVerifySearchProductUsingValidProductName1() {
//        // HomePage homePage=new HomePage(driver);
//        HomePage2 homePage2 = PageFactory.initElements(driver, HomePage2.class);
//
//
//        //Action method
//        homePage2.searchProductUsingValidProductName();
//
//        // Verification method
//
//        String expectedProductName = "\"tide pods\"";
//        String actualProductName = driver.findElement(By.xpath(verifySearchProductWebElement)).getText();
//        Assert.assertEquals(actualProductName, expectedProductName, "Product name doesn't match");
//    }
//

//    @Test
//    public void practiceVerifySearchProductUsingValidProductName1(){
//        // HomePage homePage=new HomePage(driver);
//
//
//        getInit();
//
//        //Action method
//        homePage2.searchProductUsingValidProductName();
//
//        // Verification method
//
//        String expectedProductName= "\"tide pods\"";
//        String actualProductName=driver.findElement(By.xpath(verifySearchProductWebElement)).getText();
//        Assert.assertEquals(actualProductName,expectedProductName,"Product name doesn't match");
//
//
//    }

    @Test
    public void practiceVerifySearchProductUsingValidProductName1(){

        //Action method
        homePage2.searchProductUsingValidProductName();

        // Verification method

        String expectedProductName= "\"tide pods\"";
        String actualProductName=driver.findElement(By.xpath(verifySearchProductWebElement)).getText();
        Assert.assertEquals(actualProductName,expectedProductName,"Product name doesn't match");


    }
    @Test @Ignore
    public void practiceVerifySearchProductUsingValidProductName7(){

        //Action method
        homePage2.searchProductUsingValidProductName();

        // Verification method

        String expectedProductName= "\"tide pods\"";
        String actualProductName=driver.findElement(By.xpath(verifySearchProductWebElement)).getText();
        Assert.assertEquals(actualProductName,expectedProductName,"Product name doesn't match");


    }

    @Test @Ignore
    public void practiceVerifySearchProductUsingValidProductNameFromDirectArray() throws InterruptedException {

        //Action method
        homePage2.searchProductUsingValidProductName1();


    }

    @Test  @Ignore
    public void practiceVerifySearchProductUsingValidProductNameFromExcel() throws Exception {

        //Action method
        homePage2.searchProductUsingValidProductName2();


    }

//    @Test(dataProvider = "RegistrationDataFromExcel")
//    public void practiceVerifySearchProductUsingValidProductNameFromDataProvider() throws Exception {
//
//        //Action method
//        homePage2.searchProductUsingValidProductName4();
//
//
//    }



}

