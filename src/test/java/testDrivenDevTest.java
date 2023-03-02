import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testDrivenDevTest {

    @Test

    void dividableByThreeThenReturnFizz(){
        //GIVEN
        int i = 3;

        //WHEN
        String actual = testDrivenDev.fizzBuzz(i);

        //THEN
        assertEquals("Fritz",actual);
    }

    @Test
    void dividableByFiveThenReturnBuzz(){
        //GIVEN
        int i = 5;

        //WHEN
        String actual = testDrivenDev.fizzBuzz(i);

        //THEN
        assertEquals("Buzz",actual);
    }

    @Test
    void dividableByBothThenReturnFizzBuzz(){
        //GIVEN
        int i = 15;

        //WHEN
        String actual = testDrivenDev.fizzBuzz(i);

        //THEN
        assertEquals("fizzBuzz",actual);
    }

    @Test
    void defaultIntegerFourToString(){
        //GIVEN
        int i = 4;

        //WHEN
        String actual = testDrivenDev.fizzBuzz(i);

        //THEN
        assertEquals(Integer.toString(i),actual);
    }
}
