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
