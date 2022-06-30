package com.example.calculator.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();

        Double result = calculator.sum(1.0, 2.0);

        assertEquals(3.0, result);
    }

    @Test
    public void numbersNullSumTest() {
        Calculator calculator = new Calculator();

        assertThrows(NullPointerException.class, () -> calculator.sum(null, 2.0));
    }


    @Test
    public void subTest() {
        Calculator calculator = new Calculator();

        Double result = calculator.sub(4.0, 1.0);

        assertEquals(3.0, result);
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();

        Double result = calculator.divide(8.0, 2.0);

        assertEquals(4.0, result);
    }

    @Test
    public void divisionByZeroTest() {
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> calculator.divide(6.0, 0.0));
    }

    @Test
    public void divisionNullTest(){
        Calculator calculator = new Calculator();

        assertThrows(NullPointerException.class, () -> calculator.divide(null, 2.0));
    }

    @Test
    public void factorialTest() {
        Calculator calculator = new Calculator();

        Integer result = calculator.factorial(5);

        assertEquals(120, result);
    }

    @Test
    public void integerToBinaryTest() {
        Calculator calculator = new Calculator();

        String result = String.valueOf(calculator.integerToBinary(5));

        assertEquals("101", result);
    }

    @Test
    public void integerToHexadecimalTest() {
        Calculator calculator = new Calculator();

        String result = String.valueOf(calculator.integerToHexadecimal(170));

        assertEquals("AA", result);
    }

    @Test
    public void calculeDayBetweenDateTest() {
        Calculator calculator = new Calculator();

        LocalDate date1 = LocalDate.of(2020, 3, 15);
        LocalDate date2 = LocalDate.of(2020, 3, 29);

        int result = calculator.calculeDayBetweenDate(date1, date2);

        assertEquals(14, result);
    }
}