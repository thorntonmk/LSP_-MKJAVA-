package org.howard.edu.lsp.assignment5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author PC
 */
public class IntegerSetTest {
    
    public IntegerSetTest() {
    }

    /**
     * Test of clear method, of class IntegerSet.
     */
    @Test
    @DisplayName("Test for clear")
    public void testClear() {
        // JUnit test case(s) for clear
        System.out.println("clear");
        IntegerSet instance = new IntegerSet();
        instance.clear();
        assertTrue(instance.isEmpty());
        
        instance.add(1);
        assertFalse(instance.isEmpty());
        
        instance.remove(1);
        assertTrue(instance.isEmpty());
    }

    /**
     * Test of length method, of class IntegerSet.
     */
    @Test
    @DisplayName("Test for length")
    public void testLength() {
        // JUnit test case(s) for length
        System.out.println("length");
        IntegerSet instance = new IntegerSet();
        instance.add(1);
        instance.add(2);
        instance.add(3);
        int expResult = 3;
        int result = instance.length();
        assertEquals(expResult, result);
    }

  /**
     * Test of equals method, of class IntegerSet.
     */
    @Test
    @DisplayName("Test for equals")
    public void testEquals() {
        // JUnit test case(s) for equals
        System.out.println("equals");
        IntegerSet instance = new IntegerSet();
        instance.add(1);
        instance.add(2);
        instance.add(3);
        
        IntegerSet b = new IntegerSet();
        b.add(1);
        b.add(2);
        b.add(3);

        boolean expResult = true;
        boolean result = instance.equals(b);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class IntegerSet.
     */
    @Test
    @DisplayName("Test for contains")
    public void testContains() {
        // JUnit test case(s) for contains
        System.out.println("contains");
        IntegerSet instance = new IntegerSet();
        instance.add(1);
        instance.add(2);
        instance.add(3);

