package com.calculator.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    Operation addition = new Addition();

    @Test
    public void addition(){
        assertEquals(300,addition.mathematicalOperation(100,200));
    }

}