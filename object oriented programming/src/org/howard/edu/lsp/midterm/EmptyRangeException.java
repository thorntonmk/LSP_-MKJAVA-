package org.howard.edu.lsp.assignment5;

/**
 * This class implements of the EmptyRangeException
 * @author Morgan Thornton
 */
public class EmptyRangeException  extends Exception{
    /**
     * Default Constructor
     */
    public EmptyRangeException() {
        super("Integer Set is Empty. Not a valid set!");

    }
}
