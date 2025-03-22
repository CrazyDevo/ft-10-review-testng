package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;

public class DownloadPage {

    public void downloadFile(String fileName){
        Driver.getDriver().findElement(By.partialLinkText(fileName)).click();

    }
}
