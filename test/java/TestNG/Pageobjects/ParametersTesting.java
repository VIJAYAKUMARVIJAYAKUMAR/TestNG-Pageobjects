package TestNG.Pageobjects;


import org.testng.annotations.Test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



public class ParametersTesting {
	@Test
    @Parameters({"name"})
    public void sendMessageTest(String name) {
        System.out.println(name);

    }

    @Parameters({"Title"})
    public void postPictureTest(@Optional("default title") String title) {
        System.out.println(title);

    }

    public void registerAccountTest() {
        System.out.println("Masterpiece");
    }

    @Parameters({"name", "title"})
    public void loginTest(String name, String title) {
		System.out.println(name+" "+title);

    }


}


