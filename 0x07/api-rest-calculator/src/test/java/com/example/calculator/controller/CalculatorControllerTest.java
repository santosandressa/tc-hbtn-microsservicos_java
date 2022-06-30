package com.example.calculator.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void messageWelcome() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/calculator/welcome");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Bem vindo à CALCULATOR API REST.", result.getResponse().getContentAsString());
    }

    @Test
    void addNumbers() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/calculator/addNumbers?number1=2.0&number2=2.0");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("The sum of 2,00 and 2,00 is 4,00", result.getResponse().getContentAsString());
    }

    @Test
    void subNumbers() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/calculator/subNumbers?number1=4.0&number2=2.0");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("The subtraction of 4,00 and 2,00 is 2,00", result.getResponse().getContentAsString());
    }

    @Test
    void divideNumbers() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/calculator/divideNumbers?number1=8.0&number2=2.0");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("The division of 8,00 and 2,00 is 4,00", result.getResponse().getContentAsString());
    }

    @Test
    void factorial() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/calculator/factorial?factorial=5");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("The factorial of 5 is 120", result.getResponse().getContentAsString());
    }

    @Test
    void calculeDateBetweenDate() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/calculator/calculeDayBetweenDate?localDate1=2020-01-01&localDate2=2020-01-02");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("The date between 2020-01-01 and 2020-01-02 is 1 day", result.getResponse().getContentAsString());
    }

    @Test
    void integerToBinary() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/calculator/integerToBinary?number1=5");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("The binary of 5 is 101", result.getResponse().getContentAsString());
    }

    @Test
    void integerToHexadecimal() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/calculator/integerToHexadecimal?number1=170");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("The hexadecimal of 170 is AA", result.getResponse().getContentAsString());
    }
}
