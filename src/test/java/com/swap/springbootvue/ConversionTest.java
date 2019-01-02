package com.swap.springbootvue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * ConversionTest
 */
public class ConversionTest {

    @Test
    public void testCelsiusToFahrenheit() {
        // Given
        Todo underTest = new Todo();

        // When
        double temperature = 100.0d;
        double result = underTest.celsiusToFahrenheit(temperature);

        assertEquals(212.0, result, 0.0);
    }

    @Test
    public void testFahrenheitToCelsius() {
        // Given
        Todo underTest = new Todo();

        // When
        double temperature = 104.0d;
        double result = underTest.fahrenheitToCelsius(temperature);

        assertEquals(40, result, 0.0);
    }
}