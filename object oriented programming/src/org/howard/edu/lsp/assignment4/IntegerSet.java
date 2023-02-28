package org.howard.edu.lsp.assignment4;


import java.util.ArrayList;
import java.util.List;
/**
 * This class implements the functionality of Integer Set
 * @author Morgan Thornton
 */

public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}

	/**
         * Clears the internal representation of the set
         */
        public void clear() {
            set.clear();
        }

        /**
         * Returns the length of the set
         * @return 
         */
        public int length() { // returns the length
            return set.size();
        }
