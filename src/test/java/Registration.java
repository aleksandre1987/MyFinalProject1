import RegistrationPageObject.RegistrationSteps;
import RegistrationUtils.BrowserUrl;
import org.testng.annotations.Test;

import static RegistrationData.StepData.*;

public class Registration extends BrowserUrl {


    @Test

    public void registrationForm() throws InterruptedException {

        RegistrationSteps steps = new RegistrationSteps(driver);

        steps.firstnameAction(firstNameField);
        Thread.sleep(1000);

        steps.lastNameField(lastNameField);
        Thread.sleep(1000);

        steps.jobTitleField(jobTitleField);
        Thread.sleep(1000);

        steps.educationField();
        Thread.sleep(1000);

        steps.sexField();
        Thread.sleep(1000);

        steps.experience();
        Thread.sleep(1000);

        steps.ExperienceDDL();
        Thread.sleep(1000);

        steps.dateField(dataField);
        Thread.sleep(1000);

        steps.sumbitField();
        Thread.sleep(2000);












    }
}
