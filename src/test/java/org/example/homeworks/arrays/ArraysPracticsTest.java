package org.example.homeworks.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysPracticsTest {

    ArraysPractics arrObj1 = new ArraysPractics();

    @BeforeEach
    @AfterEach
    @Test
    void largestElement() {
//        assertEquals(58, arrObj1.largestElement(new int[]{14, 58, -124, 0, 479, -25, 73}));
        assertTrue(arrObj1.largestElement(new int[]{14, 58, -124, 0, 479, -25, 73}) == 479);
        assertEquals(479, arrObj1.largestElement(new int[]{14, 58, -124, 0, 479, -25, 73}));
    }

    @Test
    void smallestElement() {
//        assertEquals(73, arrObj1.smallestElement(new int[]{14, 58, -124, 0, 479, -25, 73}));
        assertTrue(arrObj1.smallestElement(new int[]{14, 58, -124, 0, 479, -25, 73}) == -124);
        assertEquals(-124, arrObj1.smallestElement(new int[]{14, 58, -124, 0, 479, -25, 73}));
    }

//    @Test
//    void sumOfElements() {
////        եթե ես եմ ներմուծում անվերջ ցիկլ
//        assertEquals(55, arrObj1.sumOfElements());
//    }
}