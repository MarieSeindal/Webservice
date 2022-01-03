package Week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add2() {
        int expected = 3;
        Calculator calc = new Calculator();
        int actual = calc.add("1,2");

        assertEquals(expected, actual, "2 numbers");
    }
    @Test
    void add1() {
        int expected = 1;
        Calculator calc = new Calculator();
        int actual = calc.add("1");

        assertEquals(expected, actual, "1 number");
    }
    @Test
    void add0() {
        int expected = 0;
        Calculator calc = new Calculator();
        int actual = calc.add("");

        assertEquals(expected, actual, "0 number");
    }

    @Test
    void addMany() {
        int expected = 50;
        Calculator calc = new Calculator();
        int actual = calc.add("10,10,10,10,10");

        assertEquals(expected, actual, "Many numbers");
    }

    @Test
    void addDelimiter(){
        int expected = 50;
        Calculator calc = new Calculator();
        int actual = calc.add("//g\n10g10g10\n10,10");

        assertEquals(expected, actual, "Delimiter + Many numbers");
    }



}