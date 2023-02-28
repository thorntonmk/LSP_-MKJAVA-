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
       /**
         * Returns true if the 2 sets are equal, false otherwise;
         * Two sets are equal if they contain all of the same values in ANY order.
         * @param b
         * @return 
         */
        public boolean equals(IntegerSet b) {
            return set.equals(b);
        } 
        /**
         * Returns true if the set contains the value, otherwise false
         * @param value
         * @return 
         */
       public boolean contains(int value) {
            return set.contains(value);
        }    
        /**
         * Returns the largest item in the set; Throws a IntegerSetException if the set is empty
         * @return
         * @throws IntegerSetException 
         */
        public int largest()  throws IntegerSetException{
            if(set.isEmpty()){
                throw new IntegerSetException();
            }
            int max = Integer.MIN_VALUE;
            for(int i=0; i<set.size(); i++){
                if(set.get(i) > max){
                    max = set.get(i);
                }
            }
            return max;
        } 
        /**
         * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
         * @return
         * @throws IntegerSetException 
         */
        public int smallest()  throws IntegerSetException {
            if(set.isEmpty()){
                throw new IntegerSetException();
            }
            int min = Integer.MAX_VALUE;
            for(int i=0; i<set.size(); i++){
                if(set.get(i) < min){
                    min = set.get(i);
                }
            }
            return min;
        }

