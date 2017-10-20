import java.util.ArrayList;
import java.util.Iterator;

public class TestUnitaireBag {

    public static void main(String[] args) {

        System.out.println("=== Test of the Bag class ===\n");

        System.out.println("I. Test of the constructor with out param and add()\n");
        testConstructor();
        System.out.println("II. Test of the size method\n");
        testSize();
        System.out.println("III. Test of the toString method\n");
        testToString();
        System.out.println("IV. Test of the hasNext method\n");
        testHasNext();
        System.out.println("V. Test of the next method\n");
        testNext();
        System.out.println("VI. Test of the remove method\n");
        testRemove();
        System.out.println(" ===== Test finished =====\n");

    }

    public static void testConstructor() {

        System.out.println("   1) Empty Bag\n");
        Bag<Integer> bag = new Bag<Integer>();
        System.out.println(bag.toString() + "\n");

        System.out.println("   2) Bag with elements\n");
        bag.add(15);
        bag.add(9);
        bag.add(16);
        bag.add(2);
        System.out.println(bag.toString() + "\n");

        System.out.println("   3) Bag with the Collection\n");
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 10 ; i++) {
            array.add(i);
        }
        Bag<Integer> bg = new Bag<Integer>(array);
        System.out.println(bg.toString() + "\n");


    }

    public static void testSize() {

        System.out.println("   1) Empty Bag\n");
        Bag<Integer> bag = new Bag<Integer>();
        System.out.println("Taille du sac = "+bag.size() + "\n");

        System.out.println("   2) Bag with 4 elements\n");
        bag.add(15);
        bag.add(9);
        bag.add(16);
        bag.add(2);
        System.out.println("Taille du sac = "+bag.size() + "\n");

    }

    public static void testToString() {

        System.out.println("   1) Empty Bag\n");
        Bag<Integer> bag = new Bag<Integer>();
        System.out.println(bag.toString() + "\n");

        System.out.println("   2) Bag with elements\n");
        bag.add(15);
        bag.add(9);
        bag.add(16);
        bag.add(2);
        System.out.println(bag.toString() + "\n");

    }

    public static void testHasNext() {

        System.out.println("   1) Empty Bag\n");
        Bag<Integer> bag = new Bag<Integer>();
        Iterator itr = bag.iterator();
        System.out.println(itr.hasNext() + "\n");

        System.out.println("   2) Bag with elements\n");
        bag.add(15);
        bag.add(9);
        bag.add(16);
        bag.add(2);
        Iterator itr2 = bag.iterator();
        System.out.println(itr2.hasNext() + "\n");

    }

    public static void testNext() {

        System.out.println("   1) Empty Bag\n");
        Bag<Integer> bag = new Bag<Integer>();
        Iterator itr = bag.iterator();
        System.out.println(itr.next() + "\n");

        System.out.println("   2) Bag with the elements\n");
        bag.add(15);
        bag.add(9);
        bag.add(16);
        bag.add(2);
        Iterator itr2 = bag.iterator();
        System.out.println(itr2.next() + "; "+ itr2.next() + "; "+ itr2.next() + "; "+ itr2.next() + "\n");



    }

    public static void testRemove() {

        System.out.println("   1) Empty Bag\n");
        Bag<Integer> bag = new Bag<Integer>();
        Iterator itr = bag.iterator();
        itr.remove();

        System.out.println("   2) Bag with the elements\n");
        bag.add(15);
        bag.add(9);
        bag.add(16);
        bag.add(2);
        Iterator itr2 = bag.iterator();
        itr2.next();
        System.out.println(bag.toString() + "\n");
        itr2.remove();
        System.out.println(bag.toString() + "\n");
        itr2.remove();
        System.out.println(bag.toString() + "\n");
        itr2.next();
        itr2.remove();
        System.out.println(bag.toString() + "\n");


    }

}
