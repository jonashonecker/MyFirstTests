import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void addWhenOnePlusOneEqualsTwo(){
        //GIVEN
        int x = 1;
        int y = 1;

        //WHEN
        int actual = Calculator.add(x, y);
        int expected = 2;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void isEvenWhenThreeThenFalse(){
        //GIVEN
        int x = 3;

        //WHEN
        boolean actual = Calculator.isEven(x);
        boolean expected = false;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void multiplyWhenTwoTimesTwoThenFour(){
        //GIVEN
        int x = 2;
        int y = 2;

        //WHEN
        int actual = Calculator.multiply(x, y);
        int expected = 4;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void convertToUppercaseWhenHansThenHANS(){
        //GIVEN
        String x = "Hans";

        //WHEN
        String actual = Calculator.convertToUppercase(x);
        String expected = "HANS";

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void isNumberPositiveWhenMinusThreeThenFalse(){
        //GIVEN
        int x = -3;

        //WHEN
        boolean actual = Calculator.isNumberPositive(x);
        boolean expected = false;

        //THEN
        assertEquals(expected, actual);
    }
}
