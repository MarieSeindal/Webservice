package Week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int expected = 3;
        Calculator calc = new Calculator();
        int actual = calc.add(1,2);


        assertEquals(expected, actual);
    }

}