package Hooks;

import io.cucumber.java.*;

public class Myhooks {

    @Before(order = 1)
    public void browserlaunch(Scenario sc){
        System.out.println("Browser launched successfully");
        System.out.println(sc.getName());
    }

    @Before(order = 2)
    public void url(){
        System.out.println("URL Navigated  Properly");
    }

    @After (order=1)
    public void browserquit(Scenario sc){
        System.out.println("Browser closed successfully");
        System.out.println(sc.getName());
    }

    @BeforeStep
    public void takescreenshot(){
        System.out.println("Take Screen Shot");
    }

    @AfterStep
    public void refreshpage(){
        System.out.println("Please Refresh the Page");
    }

    @After (order=2)
    public void logout(){
        System.out.println("Logout successfully");
    }
}
