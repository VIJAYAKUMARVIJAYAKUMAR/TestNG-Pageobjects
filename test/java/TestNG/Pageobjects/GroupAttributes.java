
package TestNG.Pageobjects;

import org.testng.annotations.Test;

public class GroupAttributes {
	@Test(groups = {"Grouptesting"})
    public void sendMessageTest() {
        System.out.println("Test is Finished!!!");

    }

    @Test(groups = {"Testexecution"})
    public void postPictureTest() {
        System.out.println("Test");

    }

    @Test(groups = {"Kumar"})
    public void registerAccountTest() {
        System.out.println("Test3");
    }

    @Test(groups = {"vijay"})
    public void loginTest() {
        System.out.println("Test4");

    }

    @Test(groups = {"vijay", "Grouptesting"})
    public void test1() {
        System.out.println("Testing is completed ");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

}


