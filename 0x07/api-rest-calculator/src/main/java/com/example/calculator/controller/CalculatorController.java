package com.example.calculator.controller;

import com.example.calculator.model.Calculator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {

    @GetMapping("/welcome")
    public String messageWelcome() {
        return "Bem vindo à CALCULATOR API REST.";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
       DecimalFormat df = new DecimalFormat("#,##0.00");
        return "The sum of " + df.format(n1) + " and " + df.format(n2) + " is " + df.format(n1 + n2);
    }

    @GetMapping("/subNumbers")
    public String subNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("The subtraction of %s and %s is %s", df.format(n1), df.format(n2), df.format(n1 - n2));
    }

    @GetMapping("/divideNumbers")
    public String divideNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("The division of %s and %s is %s", df.format(n1), df.format(n2), df.format(n1 / n2));
    }

    @GetMapping("/factorial")
    public String factorial(@RequestParam(name = "factorial") Integer factorial) {
        Integer result = 1;

        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }

        return String.format("The factorial of %s is %s", factorial, result);
    }

    @GetMapping("/calculeDayBetweenDate")
    public String calculeDayBetweenDate(
            @RequestParam("localDate1") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate1,
            @RequestParam("localDate2") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate2) {

        return String.format("The date between %s and %s is %s day", localDate1, localDate2, ChronoUnit.DAYS.between(localDate1, localDate2));

    }

    @GetMapping("/integerToBinary")
    public String integerToBinary(@RequestParam(name = "number1") Integer n1) {
        return "The binary of " + n1 + " is " + Integer.toBinaryString(n1);
    }

    @GetMapping("/integerToHexadecimal")
    public String integerToHexadecimal(@RequestParam(name = "number1") Integer n1) {
        String hexadecimal = Integer.toHexString(n1);

        return String.format("The hexadecimal of %s is %s", n1, hexadecimal.toUpperCase());
    }
}
