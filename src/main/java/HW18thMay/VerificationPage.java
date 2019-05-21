package HW18thMay;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class VerificationPage extends Utils {

LoadProps loadProps = new LoadProps();

    private By _regtrationMessage =By.xpath("//div[@class='result']");

    public void registrationSuccesfullMessage() {

assertTextMessage("Your registration completed",_regtrationMessage);
        {
            System.out.println("Registration Successful");
        }
    }

    public void userCanSeeThatAreProductCurrencyAreChanged(){

        //verify all currency of all products are dollar or not

        boolean present = false;
        List<WebElement> activeList = driver.findElements(By.className("actual-price"));
        //List<WebElement> activeList = driver.findElements(By.cssSelector("span.actual-price"));
        for (WebElement element : activeList) {
            String str = element.getText();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '$') {
                    present = true;

                }
            }
            if (present == true) {
                System.out.println("$" + " is present in the array list");
                // break;
            } else {
                System.out.println("The $ is not present at the array list");
            }
        }



    }
}