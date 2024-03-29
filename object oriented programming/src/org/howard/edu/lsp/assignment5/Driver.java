package org.howard.edu.lsp.assignment5;
/**
 * This class tests the implementation of IntegerSet.
 * @author Morgan Thornton
 */
public class Driver {
    public static void main(String args[]) throws IntegerSetException{
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set1 is:" + set1.toString());
        System.out.println("Smallest value in Set1 is:" + set1.smallest());
        System.out.println("Largest value in Set1 is:" + set1.largest());
        
        IntegerSet set2 = new IntegerSet();
        set2.add(4);
        set2.add(5);

        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 is:" + set1.toString());
        System.out.println("Value of Set2 is:" + set2.toString());
        set1.union(set2);	// union of set1 and set2
        System.out.println("Result of union of Set1 and Set2");
        System.out.println(set1.toString());	// result of union of set1 and set2
        
        
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        set2.clear();
        set2.add(3);
        set2.add(5);
        
        System.out.println("Intersect of Set1 and Set2");
        System.out.println("Value of Set1 is:" + set1.toString());
        System.out.println("Value of Set2 is:" + set2.toString());
        set1.intersect(set2);	// Intersect of set1 and set2
        System.out.println("Result of Intersect of Set1 and Set2");
        System.out.println(set1.toString());	// result of Intersect of set1 and set2

        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        set2.clear();
        set2.add(3);
        set2.add(4);
        
        System.out.println("Diff of Set1 and Set2");
        System.out.println("Value of Set1 is:" + set1.toString());
        System.out.println("Value of Set2 is:" + set2.toString());
        set1.diff(set2);	// Diff of set1 and set2
        System.out.println("Result of Diff of Set1 and Set2");
        System.out.println(set1.toString());	// result of Diff of set1 and set2

    }
}
