package org.howard.edu.lsp.assignment5;


import java.util.ArrayList;
import java.util.Collections;
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
            Collections.sort(set);
            Collections.sort(b.set);
            return set.equals(b.set);
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

	/**
         * Adds an item to the set or does nothing it already there
         * adds item to the set or does nothing if it is in set
         * @param item 
         */
 	public void add(int item) {
            if(!set.contains(item))
                set.add(item);
        }
	/**
         * Removes an item from the set or does nothing if not there
         * @param item 
         */
        public void remove(Integer item) {
            if(set.contains(item))
                set.remove(item);
        } 
        /**
         * Set union: union will be removeAll and then addAll
         * @param intSetb 
         */
        public void union(IntegerSet intSetb) {
            set.removeAll(intSetb.set);
            set.addAll(intSetb.set);
        }
        /**
         * Set intersection: retains all the elements of set b.
         * list1.retainAll(list2) - is intersection
         * @param intSetb 
         */
        public void intersect(IntegerSet intSetb) {
            set.retainAll(intSetb.set);
        } 
        /**
         * Set difference, i.e., s1 –s2
         * @param intSetb 
         */
        public void diff(IntegerSet intSetb) 
        {
            set.removeAll(intSetb.set);
        }
        /**
         * Returns true if the set is empty, false otherwise
         * @return 
         */
        boolean isEmpty(){
            return set.isEmpty();
        } 

        /**
         * Return String representation of your set
         * @return 
         */
        @Override
        public String toString() {	
            return set.toString();
        }
}
