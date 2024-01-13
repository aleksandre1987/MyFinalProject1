package RegistracionObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class StepObject {


    protected By


    firstName = By.id("first-name"),
    lastName = By.id("last-name"),
    jobTitle = By.id("job-title"),
    highestLevelOfEducation = By.id("radio-button-2"),
    sex = By.id("checkbox-1"),
    yearsOfExperienceDDL = By.id("select-menu"),

    date = By.id("datepicker"),
    sumbit = By.xpath("/html/body/div/form/div/div[8]/a");


}
