package RegistrationPageObject;

import RegistracionObject.StepObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationSteps extends StepObject {

    WebDriver driver;

    public  RegistrationSteps(WebDriver driver1){
        driver = driver1;
    }
    public void firstnameAction(String nameField){
        driver.findElement(firstName).sendKeys(nameField);
    }
    public void lastNameField(String lastNameField){
        driver.findElement(lastName).sendKeys(lastNameField);
    }
    public void jobTitleField(String jobtitle){
        driver.findElement(jobTitle).sendKeys(jobtitle);
    }
    public void educationField(){
        driver.findElement(highestLevelOfEducation).click();
    }
    public void sexField(){
        driver.findElement(sex).click();
    }
    public void  experience() {
        driver.findElement(yearsOfExperienceDDL).click();
    }
    public void ExperienceDDL(){
        Select ExperienceDropDown = new Select(driver.findElement(yearsOfExperienceDDL));
        int experienceDropdownSize = ExperienceDropDown.getOptions().size();
        System.out.println(experienceDropdownSize);
        System.out.println("ტესტი წარმატებით დასრულდა");
        for (int i = 0; i < experienceDropdownSize; i++){
            ExperienceDropDown.selectByIndex(i);
            System.out.println(i);
            ExperienceDropDown.selectByValue("4");
        }
    }
    public void dateField(String dateField){
        driver.findElement(date).sendKeys(dateField);
    }
    public void sumbitField(){
        driver.findElement(sumbit).click();
    }



}
