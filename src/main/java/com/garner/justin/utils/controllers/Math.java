package com.garner.justin.utils.controllers;

import com.garner.justin.model.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.ui.context.support.ResourceBundleThemeSource;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.SchemaOutputResolver;


@RestController
public class Math {

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution addSolution(@RequestBody MathSolution input) {
    input.setOperation("add");
    input.setAnswer();
    return input;
    }


    @PostMapping("/subtract")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution subtractSolution(@RequestBody MathSolution input) {
        input.setOperation("subtract");
        input.setAnswer();
        return input;
    }

    @PostMapping("/multiply")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution multiplySolution(@RequestBody MathSolution input) {
        input.setOperation("multiply");
        input.setAnswer();
        return input;
    }

    @PostMapping("/divide")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution divideSolution(@RequestBody MathSolution input) {
        input.setOperation("divide");
        input.setAnswer();
        return input;
    }

}
