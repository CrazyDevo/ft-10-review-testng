package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage{

public DropdownPage(){
    PageFactory.initElements(Driver.getDriver(),this);

}



@FindBy(id = "state")
public WebElement stateDropdown;

}
