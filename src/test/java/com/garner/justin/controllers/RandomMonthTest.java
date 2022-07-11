package com.garner.justin.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.garner.justin.model.Month;
import com.garner.justin.utils.controllers.MonthConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthConverter.class)
public class RandomMonthTest {


    // Wiring in the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();


    @Test
    public void shouldReturnRandomMonth() throws Exception {


        Month outputSolution = new Month(1, "January");
        String outputJSON = mapper.writeValueAsString(outputSolution);

        // ACT
        mockMvc.perform(
                        get("/month/1")                            // Perform the POST request.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isOk());        // ASSERT that what we're expecting is what we got back.
    }
}