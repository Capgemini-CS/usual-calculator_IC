package com.calculator.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    Operation multiplication = new Multiplication();

    @Test
    public void multiplication(){
        assertEquals(100,multiplication.mathematicalOperation(50,2));
    }
}