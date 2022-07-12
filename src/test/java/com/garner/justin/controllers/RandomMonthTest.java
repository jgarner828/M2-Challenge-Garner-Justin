package com.garner.justin.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RandomMonth.class)
public class RandomMonthTest {


    // Wiring in the MockMvc object
    @Autowired
    private MockMvc mockMvc;


    @Test
    public void shouldReturnRandomMonth() throws Exception {


        // ACT
        mockMvc.perform(
                        get("/randomMonth")                            // Perform the POST request.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated());        // ASSERT that what we're expecting is what we got back.
    }
}