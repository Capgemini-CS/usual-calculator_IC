package com.calculator.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    Operation division = new Division();

    @Test
    public void division(){
        assertEquals(10,division.mathematicalOperation(100,10));
    }
}