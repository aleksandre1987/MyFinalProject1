package StepObject;

import PageObject.LoginObject;
import org.openqa.selenium.WebDriver;

public class LogInSteps extends LoginObject {

    WebDriver driver;
        public LogInSteps(WebDriver driver1){
            driver = driver1;

        }


        public void EmailAction(String email){
            driver.findElement(emailField).sendKeys(email);
        }
        public void continueEmailButton(){
            driver.findElement(ContinueWithEmail).click();
        }
        public void passwordAction(String passwordfield){
            driver.findElement(password).sendKeys(passwordfield);
        }
        public void showPasswordAction(){
            driver.findElement(ShowPusswordButton).click();
        }
        public void signInActionButton(){
            driver.findElement(signIn).click();
        }
        public void profileDDLAction(){
            driver.findElement(profileDDL).click();
        }
        public void profileButtonAction(){
            driver.findElement(profileButton).click();
        }


            }







