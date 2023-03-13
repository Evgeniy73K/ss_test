package com.example.ss_test;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPage;

import java.time.Duration;

public class LoginPageTest extends  BaseTest{


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void invalidAuthorizationTest() {
        loginPage.login("test", "test");
        Assert.assertEquals(loginPage.getText(), "Epic sadface: Username and password do not match any user in this service");
    }



}
