package com.example.hellodeploymentapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloControllerTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello").
                queryParam("name","gyandeep"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("welcome gyandeep"));

    }
    @Test
    void helloControllerTestNullName() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Welcome dummy user"));

    }

    @Test
    void helloControllerTestEmptyName() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello")
                .queryParam("name",""))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Welcome dummy user"));

    }


    @Test
    void calculateControllerTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/calculate")
                                              .queryParam("firstNumber","12")
                                              .queryParam("secondNumber","12")
                       ).andExpect(status().isOk())
                        .andExpect(MockMvcResultMatchers.content().string("24"));
    }
}
