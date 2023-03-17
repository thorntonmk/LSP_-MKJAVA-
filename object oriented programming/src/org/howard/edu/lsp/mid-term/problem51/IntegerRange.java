package org.howard.edu.lsp.assignment5;

/**
 * This class implements the functionality of Range A Range objects represents
 * an integer range, such as 1-10 or 50701-50799. The lower and upper bounds of
 * a Range are given at the time the object is created.
 *
 * @author Morgan Thornton
 */
public class IntegerRange implements Range {

    private int lower;
    private int upper;

    public IntegerRange(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }

    /**
     * returns true if v is ≥ lower bound and ≤ upper bound,and false otherwise
     *
     * @param value
     * @return
     */
    @Override
    public boolean contains(int value) {
        if (value >= this.lower && value <= this.upper) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * returns true if the receiver contains at least one value in common with
     * other, and false otherwise EmptyRangeException is thrown when a null
     * Range object is passed to the method
     *
     * @param other
     * @return
     * @throws EmptyRangeException
     */
    @Override
    public boolean overlaps(Range other) throws EmptyRangeException {

        IntegerRange otherIntegerRange = (IntegerRange) other;
        if (other == null) {
            throw new EmptyRangeException();
        }
        if (contains(otherIntegerRange.getLower())
                || contains(otherIntegerRange.getUpper())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return upper-lower+1;
    }
}
