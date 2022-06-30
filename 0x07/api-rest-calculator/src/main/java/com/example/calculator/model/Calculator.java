package com.example.calculator.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculator {

    public Double sum(Double number1, Double number2) {
        Double result = number1 + number2;

        if (number1.isNaN() || number2.isNaN()) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }

        return result;
    }

    public Double sub(Double number1, Double number2) {

        Double result = number1 - number2;

        if (number1.isNaN() || number2.isNaN()) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }

        return result;
    }

    public Double divide(Double number1, Double number2) {

        if (number1.isNaN() || number2.isNaN()) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }

        if (number2 == 0.0) {
            throw new ArithmeticException("Divisão por zero não é permitido.");
        }

        return number1 / number2;
    }

    public Integer factorial(Integer factorial) {
        if (factorial < 0) {
            throw new IllegalArgumentException("Número deve ser maior que zero.");
        }

        int result = 1;

        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }

        return result;
    }

    // Exemplos:
    // Integer = 1 -> Binary = 1
    // Integer = 5 -> Binary = 101
    // Integer = 20 -> Binary = 10100

    public Integer integerToBinary(Integer integer) {

        String binaryString = Integer.toBinaryString(integer);

        return Integer.parseInt(binaryString);
    }

    // Exemplos:
    // Integer = 1 -> Hexadecimal = "1"
    // Integer = 5 -> Hexadecimal = "37"
    // Integer = 170 -> Binary = "AA"
    public String integerToHexadecimal(Integer integer) {

        String hex = Integer.toHexString(integer);

        return hex.toUpperCase();
    }

    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {

        return (int) ChronoUnit.DAYS.between(date1, date2);

    }
}
