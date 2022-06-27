package com.syntax.class23;

import java.net.URL;

public class WebDriver {
    public void startBrowser(){
        System.out.println("starting the browser");
    }
    public void openUrl(String url) {
        System.out.println("opening "+url);
    }
    public void testLoginPage() {
        System.out.println("checking if login page is visible ");
    }
    public void closeBrowser() {
        System.out.println("closing the browser");
    }
}

class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        super.startBrowser();
        System.out.println("openning google Chrome");
    }

    @Override
    public void openUrl(String url) {
        super.openUrl(url);
        System.out.println("opening the URL "+url+" on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        super.testLoginPage();
        System.out.println("Testing the login page on Google Chrome");
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
        System.out.println("closiong the Google Chrome");
    }
}
class Edge extends WebDriver{
    @Override
    public void startBrowser() {
        super.startBrowser();
        System.out.println("Starting the Edge");
    }

    @Override
    public void openUrl(String url) {
        super.openUrl(url);
        System.out.println("opening the URL "+ url+" on Edge");
    }

    @Override
    public void testLoginPage() {
        super.testLoginPage();
        System.out.println("Testing the login page on Edge");
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
        System.out.println("closing the Edgex");
    }
}
class IE extends WebDriver{
    @Override
    public void startBrowser() {
        super.startBrowser();
        System.out.println("Starting the IE");
    }

    @Override
    public void openUrl(String url) {
        super.openUrl(url);
        System.out.println("opening the URL "+ url+" on IE");
    }

    @Override
    public void testLoginPage() {
        super.testLoginPage();
        System.out.println("Testing the login page on IE");
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
        System.out.println("closing the IEx");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        super.startBrowser();
        System.out.println("Starting the FireFox");
    }

    @Override
    public void openUrl(String url) {
        super.openUrl(url);
        System.out.println("opening the URL "+ url+" on FireFox");
    }

    @Override
    public void testLoginPage() {
        super.testLoginPage();
        System.out.println("Testing the login page on FireFox");
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
        System.out.println("closing the FireFoxx");
    }
}
