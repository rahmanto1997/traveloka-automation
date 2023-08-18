package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.ThreadLocalDriver;

public class Hooks extends BaseSteps {

    @Before
    public void setup() {
        if (ThreadLocalDriver.getTLDriver()!= null){
            setupCucumber();
        }else {
            System.out.println("Setup Switch API Test");
        }

    }

    @After
    public void stop(Scenario scenario) {
        if (ThreadLocalDriver.getTLDriver()!= null){
            teardown(scenario);
        }else {
            System.out.println("Finish Switch API Test");
        }
    }
}
