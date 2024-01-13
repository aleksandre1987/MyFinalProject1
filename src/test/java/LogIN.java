import StepObject.LogInSteps;
import WebBrowser.WebBrowserUrl;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.LogInData.*;

public class LogIN extends WebBrowserUrl{

    @Test(priority = 2)

    public void logInWithCorrectData() throws InterruptedException {
      LogInSteps steps = new LogInSteps(driver);

      steps.EmailAction(correctEmail);
      Thread.sleep(1000);

      steps.continueEmailButton();
      Thread.sleep(1000);

      steps.passwordAction(correctPassword);
      Thread.sleep(1000);

      steps.showPasswordAction();
      Thread.sleep(1000);

      steps.signInActionButton();
      Thread.sleep(1000);

      steps.profileDDLAction();
      Thread.sleep(1000);

      steps.profileButtonAction();
      Thread.sleep(1000);

    }
    @Test(priority = 1)


    public void logInWithInCorrectData() throws InterruptedException {
        LogInSteps steps = new LogInSteps(driver);


        steps.EmailAction(inCorrectEmail);
        Thread.sleep(1000);

        steps.continueEmailButton();
        Thread.sleep(1000);

        steps.passwordAction(inCorrectPassword);
        Thread.sleep(1000);

        steps.showPasswordAction();
        Thread.sleep(1000);

        steps.signInActionButton();
        Thread.sleep(1000);

        String
                expectedURL = "https://www.glassdoor.ca/index.htm",
                actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);






    }

}
