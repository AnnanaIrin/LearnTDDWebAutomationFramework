package com.amazon.pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.amazon.pageElement.HomePageNewElement.*;
import static configuration.common.GlobalReUsableMethods.*;

public class HomePageNew extends WebTestBase {

    //Constructor
    public HomePageNew(){
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(xpath =searchButtonWebElement)
    public WebElement searchButton;
    @FindBy(xpath =verifySearchProductWebElement)
    public WebElement verifySearchProduct;

   //Search product
    public void searchValidProduct(String productName){
        //searchBox.sendKeys();
        enterValueOnElement(searchBox,productName);
        clickOnElement(searchButton);
    }

    //Valid Sofa and Couches
    @FindBy(xpath =homeButtonWebElement)
    public WebElement homeButton;
    @FindBy(xpath =furnitureWebElement)
    public WebElement furniture ;

    @FindBy(xpath = sofasAndCouchesWebElement)
    public WebElement sofasAndCouches;

    @FindBy(xpath = verifySofaAndCouchesWebElement)
    public WebElement verifySofaAndCouches;



    public void sofaAndCouchesProduct() throws InterruptedException {
        clickOnElement(homeButton);
        waitFor(5);
        clickOnElement(furniture);
        waitFor(5);
        scrollDownToElement(sofasAndCouches);
        waitFor(5);
        clickOnElement(sofasAndCouches);
        waitFor(5);
        scrollDownToElement(verifySofaAndCouches);
        waitFor(5);
    }










}
