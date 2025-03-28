package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {

    public RadioButtonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "blue")
    public WebElement blueRadioButton;

    @FindBy(id = "football")
    public WebElement footballRadioButton;

public void  navigate(){
    Driver.getDriver().get(ConfigurationReader.getProperty("practice.url")+"/radio_buttons");
}


/*
    static {
        Driver.getDriver().get(ConfigurationReader.getProperty("practice.url")+"/radio_buttons");
    }
*/

}
