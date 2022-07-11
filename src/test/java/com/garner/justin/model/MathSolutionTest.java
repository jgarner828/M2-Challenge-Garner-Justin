package com.garner.justin.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathSolutionTest {

    @Test
    public void shouldCreateANewMathSolution() throws Exception {
        MathSolution newMathSolution = new MathSolution(1, 2);
        int expectedOperand1 = 1;
        int expectedOperand2 = 2;
        assertEquals(expectedOperand1, newMathSolution.getOperand1());
        assertEquals(expectedOperand2, newMathSolution.getOperand2());

        newMathSolution.setOperation("add");
        newMathSolution.setAnswer();
        int expectedAnswer = 3;
        assertEquals(expectedAnswer, newMathSolution.getAnswer(), 0);

        newMathSolution.setOperand1(2);
        newMathSolution.setOperand2(1);
        newMathSolution.setOperation("subtract");
        newMathSolution.setAnswer();
        expectedAnswer = 1;
        assertEquals(expectedAnswer, newMathSolution.getAnswer(), 0);

        newMathSolution.setOperand1(2);
        newMathSolution.setOperand2(2);
        newMathSolution.setOperation("multiply");
        newMathSolution.setAnswer();
        expectedAnswer = 4;
        assertEquals(expectedAnswer, newMathSolution.getAnswer(), 0);

        newMathSolution.setOperand1(10);
        newMathSolution.setOperand2(2);
        newMathSolution.setOperation("divide");
        newMathSolution.setAnswer();
        expectedAnswer = 5;
        assertEquals(expectedAnswer, newMathSolution.getAnswer(), 0);


    }
}