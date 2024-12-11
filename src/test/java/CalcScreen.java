import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;

public class CalcScreen {

    @FindBy(id="com.google.android.calculator:id/eq")
    WebElement btnEqual;
    @FindBy(id="com.google.android.calculator:id/result_final")
    WebElement txtResult;
    AndroidDriver driver;
    public CalcScreen(AndroidDriver driver)
    { this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public String doCalculation(String expression )
    {


        char[] tokens = expression.toCharArray();;
        System.out.println(Arrays.toString(tokens));

        for (char token : tokens) {
            switch (token) {
                case '1':
                    pressButton("digit_1");
                    break;
                case '2':
                    pressButton("digit_2");
                    break;
                case '3':
                    pressButton("digit_3");
                    break;
                case '4':
                    pressButton("digit_4");
                    break;
                case '5':
                    pressButton("digit_5");
                    break;
                case '6':
                    pressButton("digit_6");
                    break;
                case '7':
                    pressButton("digit_7");
                    break;
                case '8':
                    pressButton("digit_8");
                    break;
                case '9':
                    pressButton("digit_9");
                    break;
                case '0':
                    pressButton("digit_0");
                    break;
                case '+':
                    pressButton("op_add");
                    break;
                case '-':
                    pressButton("op_sub");
                    break;
                case '*':
                    pressButton("op_mul");
                    break;
                case '/':
                    pressButton("op_div");
                    break;
            }
        }
        btnEqual.click();

        return txtResult.getText();
    }
    public void pressButton(String element)
    {
driver.findElement(By.id("com.google.android.calculator:id/"+element)).click();
    }

}
