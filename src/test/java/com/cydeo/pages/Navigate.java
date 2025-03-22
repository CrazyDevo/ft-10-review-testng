package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;

public interface Navigate {

    static void navigate(String endpoint){
        Driver.getDriver().get(ConfigurationReader.getProperty("practice.url")+endpoint);
    }
}
