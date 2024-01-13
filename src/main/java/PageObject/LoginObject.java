package PageObject;

import org.openqa.selenium.By;

public class LoginObject {

   protected By

    emailField = By.id("inlineUserEmail"),
    password = By.id("inlineUserPassword"),
    ContinueWithEmail = By.xpath("//*[@id=\"InlineLoginModule\"]/div/div/div[1]/div/div/div/div/form/div[2]/button"),
    ShowPusswordButton = By.xpath("//*[@id=\"showPasswordCheckbox\"]/label/span[2]"),
    signIn = By.xpath("//*[@id=\"InlineLoginModule\"]/div/div/div[1]/div/div/div/div/form/div[4]/button"),
    profileDDL = By.xpath("//*[@id=\"UtilityNav\"]/div[3]/div/button"),
    profileButton = By.xpath("//*[@id=\"UtilityNav\"]/div[3]/div/div/ul[1]/li[1]/a");




}
