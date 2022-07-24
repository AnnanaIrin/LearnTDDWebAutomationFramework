package com.amazon.pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.amazon.pageElement.HomePageElements.*;

public class HomePage extends WebTestBase {
    // Constructor of page Object class and pass driver from webTestBase class
    public HomePage(WebDriver driver){
        //WebTestBase.driver=driver;
        PageFactory.initElements(driver,this);//WebTestBase extend help us to get this driver, PageFactory is a class, init element a method

    }

    //Action class for business flow

   //Action method for search box functionality with valid product name purpose
    public static  void searchProductUsingValidProductName1() throws InterruptedException {
       //Traditional approach
        driver.findElement(By.xpath(searchBoxWebElement)).sendKeys("tide pods");
        Thread.sleep(2000);
        driver.findElement(By.xpath(searchButtonWebElement)).click();
        Thread.sleep(2000);


    }

    //Modern Approach: @FindBy with how
    // means the locator strategy Xpath
    //FindBy @ come in from selenium

    @FindBy()
    public WebElement variableName;
//    @FindBy(how = How.XPATH,using = searchBoxWebElement) public WebElement searchBox;
//
//    public void demo(){
//        searchBox.sendKeys("tide pods");
//    }

    //Modern Approach: @FindBy
    @FindBy(xpath = searchBoxWebElement) public  WebElement searchBox;

    @FindBy(xpath =searchButtonWebElement) public WebElement searchButton;


    public  void searchProductUsingValidProductName() throws InterruptedException {
        Thread.sleep(2000);
         searchBox.sendKeys("tide pods");
        Thread.sleep(10000);
         searchButton.click();
        Thread.sleep(2000);


    }




}
