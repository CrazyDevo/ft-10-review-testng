package com.cydeo.tests;

import com.cydeo.pages.DropdownPage;
import com.cydeo.pages.Navigate;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Se03_DropdownTests {


    @Test
    public void test1() {
        //TC#1
        //1. Go to http://practice.cydeo.com/dropdown
        Navigate.navigate("/dropdown");
DropdownPage dropdownPage=new DropdownPage();
        //2. Select Illinois --> select by visible text

        Select select=new Select(dropdownPage.stateDropdown);

        select.selectByVisibleText("Illinois");


        //3. Select Virginia --> select by value
        select.selectByValue("VA");
        //4. Select California --> select by index
        select.selectByIndex(5);
        //5. Verify final selected option is California.

        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getAttribute("value"));
        }


        BrowserUtils.sleep(3);
        Driver.closeDriver();


    }
}
