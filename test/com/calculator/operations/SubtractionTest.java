package com.calculator.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    Operation subtraction = new Subtraction();

    @Test
    public void subtraction(){
        assertEquals(100,subtraction.mathematicalOperation(200,100));
    }

}