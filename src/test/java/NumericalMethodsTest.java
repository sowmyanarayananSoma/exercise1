import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
public class NumericalMethodsTest
{
    private NumericalMethods tester;
    @BeforeEach
    public void setTester(){
        tester = new NumericalMethods();
    }

    @Test
    public void testSquare(){
        Assertions.assertEquals(tester.square(5), 25, "5 squared must be 25");
        Assertions.assertEquals(tester.square(0), 0, "0 is 0");
        Assertions.assertEquals(tester.square(-5), 25, "-5 squared is 25");
    }

    @Test
    public void testPalindrome(){
        Assertions.assertEquals(tester.palindrome(123),321);
        Assertions.assertEquals(tester.palindrome(-123),-321);
        Assertions.assertEquals(tester.palindrome(0),0);
    }
}
