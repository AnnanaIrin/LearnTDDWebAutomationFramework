package com.amazon.pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.amazon.pageElement.HomePageElements.searchBoxWebElement;
import static com.amazon.pageElement.HomePageElements.searchButtonWebElement;

public class HomePage1 extends WebTestBase {
    //Default Constructor
//    public HomePage(WebDriver driver){
//        //WebTestBase.driver=driver;
//        PageFactory.initElements(driver,this);//WebTestBase extend help us to get this driver, PageFactory is a class, init element a method
//
//    }
    public HomePage1(){
        //WebTestBase.driver=driver;
        PageFactory.initElements(driver,this);//WebTestBase extend help us to get this driver, PageFactory is a class, init element a method

    }

    //Action class for business flow

   //Action method for search box functionality with valid product name purpose
    public static  void searchProductUsingValidProductName1(){
       //Traditional approach
        driver.findElement(By.xpath(searchBoxWebElement)).sendKeys("tide pods");
        driver.findElement(By.xpath(searchButtonWebElement)).click();


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


    public  void searchProductUsingValidProductName(){

         searchBox.sendKeys("tide pods");
         searchButton.click();


    }




}
