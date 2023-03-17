package org.howard.edu.lsp.assignment5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author PC
 */
public class IntegerRangeTest {
    
    public IntegerRangeTest() {
    }
    
    /**
     * Test of getLower method, of class IntegerRange.
     */
    @Test
    @DisplayName("Test for lower")
    public void testGetLower() {
        System.out.println("getLower");
        IntegerRange instance = new IntegerRange(1, 10);
        int expResult = 1;
        int result = instance.getLower();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUpper method, of class IntegerRange.
     */
    @Test
    @DisplayName("Test for upper")
    public void testGetUpper() {
        System.out.println("getUpper");
        IntegerRange instance = new IntegerRange(1, 10);
        int expResult = 10;
        int result = instance.getUpper();
        assertEquals(expResult, result);
    }


    /**
     * Test of contains method, of class IntegerRange.
     */
    @Test
    @DisplayName("Test for contains")
    public void testContains() {
        System.out.println("contains");
        int value = 5;
        IntegerRange instance = new IntegerRange(1, 10);
        boolean expResult = true;
        boolean result = instance.contains(value);
        assertEquals(expResult, result);
    }

    /**
     * Test of overlaps method, of class IntegerRange.
     */
    @Test
    public void testOverlaps(){
        System.out.println("overlaps");
        Range other = null;
        IntegerRange instance = new IntegerRange(1, 10);
        try{
            boolean expResult = false;
            boolean result = instance.overlaps(other);
            assertEquals(expResult, result);
        }catch(EmptyRangeException e){
            System.err.println(e.getMessage());
        }
        
        other = new IntegerRange(5, 15);
        boolean expResult = true;
        boolean result;
        try {
            result = instance.overlaps(other);
            assertEquals(expResult, result);
        } catch (EmptyRangeException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * Test of size method, of class IntegerRange.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        IntegerRange instance = new IntegerRange(1, 10);
        int expResult = 10;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
}
