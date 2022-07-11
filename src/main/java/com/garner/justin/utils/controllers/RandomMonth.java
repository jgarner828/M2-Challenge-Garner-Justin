package com.garner.justin.utils.controllers;

import com.garner.justin.model.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static com.garner.justin.utils.RandomNumGenerator.generateRandomMonth;

@RestController
public class RandomMonth {

    @GetMapping("/randomMonth")
    @ResponseStatus(HttpStatus.OK)
    public Month getRandomMonth() {

        int monthNumber = generateRandomMonth(12);

        switch (monthNumber) {
            case 1:
                return new Month(1, "January");
            case 2:
                return new Month(2, "February");
            case 3:
                return new Month(3, "March");
            case 4:
                return new Month(4, "April");
            case 5:
                return new Month(5, "May");
            case 6:
                return new Month(6, "June");
            case 7:
                return new Month(7, "July");
            case 8:
                return new Month(8, "August");
            case 9:
                return new Month(9, "September");
            case 10:
                return new Month(10, "October");
            case 11:
                return new Month(11, "November");
            case 12:
                return new Month(12, "December");
            default:
                throw new IllegalArgumentException("Random number generator broke!!! HOW???");
        }
    }

}
