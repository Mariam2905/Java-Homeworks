package org.example.homeworks.string_stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    @Test
    void isEmptyTest() {
        String str = "";
        assertTrue(str.isEmpty() == true);
        assertEquals(0, str.length());
        assertNotNull(str);
    }

    @Test
    void endsWithTest() {
        String str = "hello";
        assertTrue(str.endsWith("o") == true);
        assertEquals(true, str.endsWith("lo"));
        assertNotNull(str);
    }

    @Test
    void startsWithTest() {
        String str = "word";
        assertTrue(str.startsWith("w"));
        assertTrue(str.startsWith("word"));
        assertNotNull(str);
        assertFalse(str.startsWith(" word"));
        assertFalse(str.startsWith("word!"));
    }

    @Test
    void charAtTest() {
        String str = "Hello world!";
        assertEquals('o', str.charAt(4));
        assertNotNull(str);
        boolean flag = false;
        try {
            str.charAt(13);
        } catch (StringIndexOutOfBoundsException e) {
            flag = true;
        }
        assertTrue(flag);
    }

    @Test
    void indexOfTest() {
        String str = "String Methods";
        assertEquals(7, str.indexOf('M'));
    }

    @Test
    void lengthTest() {
        String str = "Java";
        assertEquals(4, str.length());
        assertTrue(str.length() == 4);
    }

    @Test
    void equalsTest() {
        String str = "test";
        assertTrue(str.equals("test"));
//        assertTrue(str.equals(new String("test ")));
        assertFalse(str.equals(" test"));
    }

    @Test
    void contentEqualsTest() {
        String str = "Test";
        StringBuilder sb = new StringBuilder("Test");
        assertTrue(str.contentEquals(sb));
        sb.append("1");
        assertFalse(str.contentEquals(sb));
    }

    @Test
    void equalsIgnoreCaseTest() {
        String str = "reTURn";
        String str1 = "return";
        assertTrue(str.equalsIgnoreCase(str1));
    }

    @Test
    void substringTest() {
        String str = "Unit test";
        assertEquals("Unit", str.substring(0, 4));
    }

    @Test
    void toUpperCaseTest() {
        String str = "Enum";
        str = str.toUpperCase();
        assertEquals("ENUM", str);
    }

    @Test
    void toLowerCaseTest(){
        String str = "TEST";
        str = str.toLowerCase();
        assertEquals("test", str);
    }
}
