package com.cydeo.tests;

import com.cydeo.pages.RadioButtonPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Se01_RadioButtonTests {



    //TC #1:radio buttons
    //1.GO TO: http://practice.cydeo.com/radio_buttons
    //2. Confirm radio button #Blue is selected by default
    //3. Confirm radio button #Football is NOT selected by default
    //4. Click radio button #Football to select it.
    //5. Verify radio button #Football is selected.
    //6. Click radio button #Red to select it.
    //7. Verify radio button #Red is selected.
    //8. Verify radio button #Blue is not selected.
    //9. Verify radio button #Green is not Enabled.


    @Test
    public void test1() {
        //1.GO TO: http://practice.cydeo.com/radio_buttons
        RadioButtonPage radioButtonPage=new RadioButtonPage();
        radioButtonPage.navigate();


        //2. Confirm radio button #Blue is selected by default
        boolean selected = radioButtonPage.blueRadioButton.isSelected();
        Assert.assertTrue(selected);

        //3. Confirm radio button #Football is NOT selected by default
        Assert.assertFalse(radioButtonPage.footballRadioButton.isSelected());
        //4. Click radio button #Football to select it.
        radioButtonPage.footballRadioButton.click();
        //5. Verify radio button #Football is selected.
        Assert.assertTrue(radioButtonPage.footballRadioButton.isSelected());
        //6. Click radio button #Red to select it.
        //7. Verify radio button #Red is selected.
        //8. Verify radio button #Blue is not selected.
        //9. Verify radio button #Green is not Enabled.


        BrowserUtils.sleep(3);
        Driver.closeDriver();

    }
}
