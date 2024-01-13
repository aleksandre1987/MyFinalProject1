package DataObject;

import com.github.javafaker.Faker;

public class LogInData {
   static Faker faker1 = new Faker();
   public static String

    correctEmail = "aleko.kikoliashvili@gmail.com",

    correctPassword = "kokola871$",

   inCorrectEmail = faker1.bothify("aleko.kikoliashvili@gmail.com"),
   inCorrectPassword = faker1.bothify("????##??");


}
