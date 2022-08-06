package com.amazon.testPages.HomePageTest;

import com.amazon.pages.HomePageNew;
import configuration.common.WebTestBase;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static configuration.common.GlobalReUsableMethods.scrollDownToElement;
import static configuration.common.GlobalReUsableMethods.verifyText;

public class HomePageNewTest extends WebTestBase {


    //1
    @Test @Ignore
    public void verifySearchValidProduct() throws InterruptedException {
        HomePageNew homePageNew=new HomePageNew();
        homePageNew.searchValidProduct("tide pods");
        verifyText(homePageNew.verifySearchProduct,"\"tide pods\"","Product name does not match");

    }
    //2
    @Test
    public void verifySofasWebElement() throws InterruptedException {
        HomePageNew homePageNew=new HomePageNew();
        homePageNew.sofaAndCouchesProduct();

        verifyText(homePageNew.verifySofaAndCouches,"Sofas & Couches","Product name does not match");

    }





}
