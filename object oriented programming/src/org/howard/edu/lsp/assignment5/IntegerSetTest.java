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

        int value = 1;
        boolean expResult = true;
        boolean result = instance.contains(value);
        assertEquals(expResult, result);
        
        value = 0;
        expResult = false;
        result = instance.contains(value);
        assertEquals(expResult, result);
    }
   
    /**
     * Test of largest method, of class IntegerSet.
     */
    @Test
    @DisplayName("Test for largest")
    public void testLargest() {
        // JUnit test case(s) for largest
        System.out.println("largest");
        IntegerSet instance = new IntegerSet();
        int expResult = 0;
        int result = -1;
        try{
            result = instance.largest();
            assertEquals(expResult, result);
        }catch(IntegerSetException e){
            System.err.println(e.getMessage());
        }
        
        instance.add(1);
        instance.add(2);
        instance.add(3);
        expResult = 3;
        try{
            result = instance.largest();
            assertEquals(expResult, result);
        }catch(IntegerSetException e){
           System.err.println(e.getMessage());
        }
    }
    
    /**
     * Test of smallest method, of class IntegerSet.
     */
    @Test
    @DisplayName("Test for smallest")
    public void testSmallest(){
        // JUnit test case(s) for smallest
        System.out.println("smallest");
        IntegerSet instance = new IntegerSet();
        int expResult = 0;
        int result = -1;
        try{
            result = instance.smallest();
            assertEquals(expResult, result);
        }catch(IntegerSetException e){
            System.err.println(e.getMessage());
        }
        
        instance.add(1);
        instance.add(2);
        instance.add(3);
        expResult = 1;
        try{
            result = instance.smallest();
            assertEquals(expResult, result);
        }catch(IntegerSetException e){
            System.err.println(e.getMessage());
        }
    }

     /**
     * Test of add method, of class IntegerSet.
     */
    @Test
    @DisplayName("Test for add")
    public void testAdd() {
        // JUnit test case(s) for add
        System.out.println("add");
        int item = 0;
        IntegerSet instance = new IntegerSet();
        instance.add(item);
        int expResult = 1;
        int result = instance.length();
        assertEquals(expResult, result);
        
        String strExpResult = "[0]";
        String strResult = instance.toString();
        assertEquals(strExpResult, strResult);
    }
    
    /**
     * Test of remove method, of class IntegerSet.
     */
    @Test
    @DisplayName("Test for remove")
    public void testRemove() {
        // JUnit test case(s) for remove
        System.out.println("remove");
        IntegerSet instance = new IntegerSet();
        instance.add(1);
        instance.add(2);
        instance.add(3);
        
        instance.remove(2);
        instance.remove(3);
        
        int expResult = 1;
        int result = instance.length();
        assertEquals(expResult, result);
        
        String strExpResult = "[1]";
        String strResult = instance.toString();
        assertEquals(strExpResult, strResult);
    }

