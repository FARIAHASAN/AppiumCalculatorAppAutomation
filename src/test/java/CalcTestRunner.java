import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestRunner extends SetUp {
    @Test
    public  void doCalculation()
    {

        CalcScreen  calcScreen=new CalcScreen(driver);
       String actualResult= calcScreen.doCalculation("100/10*5-10+60");
       String expectedResult="100";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
