import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class loopsWhileForTest {

    @Test
    void forLoop() {
        //GIVEN
        int faculty = 3;

        //WHEN
        int actual = loopsWhileFor.forLoop(faculty);

        //THEN
        assertEquals(6,actual);

    }

    @Test
    void whileLoop() {
        //GIVEN
        int faculty = 5;

        //WHEN
        int actual = loopsWhileFor.whileLoop(faculty);

        //THEN
        assertEquals(120,actual);

    }
}