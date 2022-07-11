package com.garner.justin.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.garner.justin.model.MathSolution;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(Math.class)
public class MathTest {

    // Wiring in the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnMathSolutionWhenAdd() throws Exception {
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(3);
        inputSolution.setOperand2(4);
        inputSolution.setOperation("add");
        inputSolution.setAnswer();

        String inputJSON = mapper.writeValueAsString(inputSolution);


        MathSolution outputSolution = new MathSolution();
        outputSolution.setOperand1(3);
        outputSolution.setOperand2(4);
        outputSolution.setOperation("add");
        outputSolution.setAnswer();

        String outputJSON = mapper.writeValueAsString(outputSolution);

        // ACT
        mockMvc.perform(
                        post("/add")                            // Perform the POST request.
                                .content(inputJSON)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(content().json(outputJSON));        // ASSERT that what we're expecting is what we got back.
    }

    @Test
    public void shouldReturnMathSolutionWhenSubtract() throws Exception {
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(4);
        inputSolution.setOperand2(2);
        inputSolution.setOperation("subtract");
        inputSolution.setAnswer();

        String inputJSON = mapper.writeValueAsString(inputSolution);


        MathSolution outputSolution = new MathSolution();
        outputSolution.setOperand1(4);
        outputSolution.setOperand2(2);
        outputSolution.setOperation("subtract");
        outputSolution.setAnswer();

        String outputJSON = mapper.writeValueAsString(outputSolution);

        // ACT
        mockMvc.perform(
                        post("/subtract")                            // Perform the POST request.
                                .content(inputJSON)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(content().json(outputJSON));        // ASSERT that what we're expecting is what we got back.
    }

    @Test
    public void shouldReturnMathSolutionWhenMultiply() throws Exception {
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(2);
        inputSolution.setOperand2(2);
        inputSolution.setOperation("multiply");
        inputSolution.setAnswer();

        String inputJSON = mapper.writeValueAsString(inputSolution);


        MathSolution outputSolution = new MathSolution();
        outputSolution.setOperand1(2);
        outputSolution.setOperand2(2);
        outputSolution.setOperation("multiply");
        outputSolution.setAnswer();

        String outputJSON = mapper.writeValueAsString(outputSolution);

        // ACT
        mockMvc.perform(
                        post("/multiply")                            // Perform the POST request.
                                .content(inputJSON)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(content().json(outputJSON));        // ASSERT that what we're expecting is what we got back.
    }

    @Test
    public void shouldReturnMathSolutionWhenDivide() throws Exception {
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(12);
        inputSolution.setOperand2(6);
        inputSolution.setOperation("divide");
        inputSolution.setAnswer();

        String inputJSON = mapper.writeValueAsString(inputSolution);


        MathSolution outputSolution = new MathSolution();
        outputSolution.setOperand1(12);
        outputSolution.setOperand2(6);
        outputSolution.setOperation("divide");
        outputSolution.setAnswer();

        String outputJSON = mapper.writeValueAsString(outputSolution);

        // ACT
        mockMvc.perform(
                        post("/divide")                            // Perform the POST request.
                                .content(inputJSON)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(content().json(outputJSON));        // ASSERT that what we're expecting is what we got back.
    }


}



