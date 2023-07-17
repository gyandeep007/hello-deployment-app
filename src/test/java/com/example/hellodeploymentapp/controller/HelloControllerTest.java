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
    void helloController() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello").
                queryParam("name","gyandeep"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("welcome gyandeep"));

    }

    @Test
    void calculateController() {
    }
}
