package com.cydeo.tests;

import com.cydeo.pages.DownloadPage;
import com.cydeo.pages.Navigate;
import com.cydeo.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Se04_DownloadFileTest {


    @Test
    public void test1() {

        Navigate.navigate("/download");

        String fileName="some-file.txt";
        DownloadPage downloadPage=new DownloadPage();
        downloadPage.downloadFile(fileName);
        BrowserUtils.sleep(3);
        File file=new File("/Users/adambarry/Downloads/"+fileName);
        Assert.assertTrue(file.exists());



    }
}
