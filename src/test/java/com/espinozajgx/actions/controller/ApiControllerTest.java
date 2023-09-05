package com.espinozajgx.actions.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("HealhCkeck response message 'I am alive' and http 200")
    void testHealhCheck() throws Exception {
       MvcResult mvcResult = mockMvc.perform(get("/api/v1/"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").value("I am alive!"))
                .andReturn();

        assertEquals("application/json",
                mvcResult.getResponse().getContentType());

        assertEquals("I am alive!",
                mvcResult.getResponse().getContentAsString());

    }
    @Test
    void main() {
        int a = 15;
        int b = 11;
        int result = a % b;
        System.out.println("El resultado del módulo entre " + a + " y " + b + " es: " + result + " y su division es:" + (a/b));

        String number = "1234567";
        String username = "Jose G. Espinoza Ch.";
        System.out.println("Ultimo numero es: " + number.substring(number.length()-1));

    }
}
