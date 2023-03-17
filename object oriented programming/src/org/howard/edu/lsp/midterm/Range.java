package org.howard.edu.lsp.assignment5;

/**
 * This interface provides the skelton of Range
 * A Range objects represents an integer range, such as 1-10 or 50701-50799. The lower and
 * upper bounds of a Range are given at the time the object is created.
 * @author Morgan Thornton
 */
public interface Range {
    // returns true if v is ≥ lower bound and ≤ upper bound,
    // and false otherwise
    public boolean contains( int value );
    // returns true if the receiver contains at least
    // one value in common with other, and false otherwise
    // EmptyRangeException is thrown when a null Range object is passed to the method
    public boolean overlaps( Range other ) throws EmptyRangeException;

    public int size();
}
