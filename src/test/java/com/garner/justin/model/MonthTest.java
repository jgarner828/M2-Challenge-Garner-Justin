package com.garner.justin.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonthTest {


    @Test
    public void canCreateMonthWithCustomerConstructor() throws Exception {
        Month testMonth = new Month(1, "January");
        int expectedNumber = 1;
        String expectedString = "January";

        assertEquals(expectedNumber, testMonth.getNumber());
        assertEquals(expectedString, testMonth.getName());
    }


}