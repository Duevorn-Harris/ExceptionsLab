package com.duevornHarris;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by duevornharris on 5/19/16.
 */
public class ExceptionsSpec {
    Calculator calculator;

    @Before
    public void calculatorInitialization(){
        calculator = new Calculator();
    }

    @Test
    public void addTest(){
        int expectedValue = 5;
        int actualValue = Calculator.add(2,3);
        Assert.assertEquals("The calculator add method returned a different answer than expected ", expectedValue,
                actualValue );
    }

    @Test
    public void subtractTest(){
        int expectedValue = -1;
        int actualValue = Calculator.subtract(2,3);
        Assert.assertEquals("The calculator subtract method returned a different answer than expected ", expectedValue,
                actualValue );
    }

    @Test
    public void multiplyTest(){
        int expectedValue = 6;
        int actualValue = Calculator.multiply(2,3);
        Assert.assertEquals("The calculator multiply method returned a different answer than expected ", expectedValue,
                actualValue );
    }

    @Test
    public void divisionTest(){
        int expectedValue = 2;
        double actualValue = 0;
        try {
            actualValue = Calculator.division(6,3);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("The calculator division method returned a different answer than expected ", expectedValue,
                actualValue, 0);
    }

    @Test
    public void divisionExceptionTest(){
        double expectedValue = 0;
        double actualValue = 0;
        try {
            actualValue = Calculator.division(6,0);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("The calculator division method returned a different answer than expected ", expectedValue,
                actualValue, 0);
    }

    @Test
    public void squareRootTest() throws ComplexNumberException {
        double expectedValue = 2;
        double actualValue = Calculator.squareRoot(4);
        Assert.assertEquals("The calculator sqaureRoot method returned a different answer than expected ", expectedValue,
                actualValue, 0);
    }

    @Test
    public void squareRootExceptionTest(){
        double expectedValue = 2;
        double actualValue = 0;
        try {
            actualValue = Calculator.squareRoot(4);
        } catch (ComplexNumberException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("The calculator sqaureRoot method returned a different answer than expected ", expectedValue,
                actualValue, 0);
    }


}
