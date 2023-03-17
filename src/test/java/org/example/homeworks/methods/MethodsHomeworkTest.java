package org.example.homeworks.methods;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsHomeworkTest {
    MethodsHomework method = new MethodsHomework();

    @Test
    void theSum() {
        assertEquals(12, method.theSum(7,5));
        assertFalse(13==method.theSum(7,5));
    }

    @Test
    void booleanInput() {
        assertTrue(method.booleanInput(true)==true);
    }

    @Test
    void sameType() {
        assertTrue(method.sameType('a')=='a');
        assertFalse(method.sameType('S')=='M');
    }
}