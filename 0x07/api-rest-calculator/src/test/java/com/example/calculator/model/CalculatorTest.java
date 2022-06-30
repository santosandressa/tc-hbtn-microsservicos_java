package com.example.calculator.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void sumTest() {


        Double result = calculator.sum(1.0, 2.0);

        assertEquals(3.0, result);
    }

    @Test
    public void numbersNullSumTest() {
        assertThrows(NullPointerException.class, () -> calculator.sum(null, 2.0));
    }


    @Test
    public void subTest() {
        Double result = calculator.sub(4.0, 1.0);

        assertEquals(3.0, result);
    }

    @Test
    public void divideTest() {
        Double result = calculator.divide(8.0, 2.0);

        assertEquals(4.0, result);
    }

    @Test
    public void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(6.0, 0.0));
    }

    @Test
    public void divisionNullTest(){

        assertThrows(NullPointerException.class, () -> calculator.divide(null, 2.0));
    }

    @Test
    public void factorialTest() {
        Integer result = calculator.factorial(5);

        assertEquals(120, result);
    }

    @Test
    public void integerToBinaryTest() {
        String result = String.valueOf(calculator.integerToBinary(5));

        assertEquals("101", result);
    }

    @Test
    public void integerToHexadecimalTest() {
        String result = String.valueOf(calculator.integerToHexadecimal(170));

        assertEquals("AA", result);
    }

    @Test
    public void calculeDayBetweenDateTest() {
        LocalDate date1 = LocalDate.of(2020, 3, 15);
        LocalDate date2 = LocalDate.of(2020, 3, 29);

        int result = calculator.calculeDayBetweenDate(date1, date2);

        assertEquals(14, result);
    }
}