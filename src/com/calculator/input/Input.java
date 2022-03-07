package com.calculator.input;

import com.calculator.exception.InvalidOperationException;

import java.io.IOException;

public interface Input {

    int inputNumber(int line) throws InvalidOperationException;

    String inputOperatorSymbol() throws InvalidOperationException;
}
