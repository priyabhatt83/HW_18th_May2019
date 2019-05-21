package HW18thMay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChangeCurrency extends Utils {

    LoadProps loadProps = new LoadProps();

    private By _currency = By.xpath("//select[@id='customerCurrency']");
    private By _euro = By.xpath("//select[@id='customerCurrency']");
    private By _dollar = By.xpath("//select[@id='customerCurrency']");

    public void userIsAbleToChangeCurrency(){

        //click on currency button
        clickElementBy(_currency);

        //select Euro
        selectByText(_euro, "Euro");

        //select dollar
        selectByText(_dollar, "US Dollar");

        { System.out.println("all products are in Dollars"); }

    }
    }


