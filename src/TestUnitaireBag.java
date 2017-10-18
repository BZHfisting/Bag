
public class TestUnitaireBag {

    public static void main(String[] args) {

        System.out.println("=== Test of the Bag class ===\n");

        System.out.println("I. Test of the constructor with out param and add()\n");
        testConstructor();
        // System.out.println("II. Test of the insert method\n");
        // testInsert();
        // System.out.println("III. Test of the isEmpty method\n");
        // testIsEmpty();
        // System.out.println("IV. Test of the getSize method\n");
        // testGetSize();
        // System.out.println("V. Test of the toString method\n");
        // testToString();
        // System.out.println("VI. Test of the getIterator method\n");
        // testGetIterator();
        // System.out.println("VI. Test of the hasNext method\n");
        // testHasNext();
        // System.out.println("VI. Test of the next method\n");
        // testNext();
        // System.out.println("VI. Test of the remove method\n");
        // testRemove();
        // System.out.println(" ===== Test finished =====\n");

    }

    public static void testConstructor() {

        System.out.println("   1) Empty Bag\n");
        Bag<Integer> bag = new Bag<Integer>();
        System.out.println(bag.toString() + "\n");

        System.out.println("   2) Bag with elements\n");
        bag.add(15);
        bag.add(9);
        bag.add(7);
        bag.add(2);
        System.out.println(bag.toString() + "\n");

    }
    //
    // public static void testInsert() {
    //
    //     System.out.println("   1) Normal test\n");
    //     LinkedSortedList l1 = new LinkedSortedList(Integer.class);
    //     l1.insert(6);
    //     l1.insert(4);
    //     l1.insert(2);
    //     l1.insert(7);
    //     l1.insert(9);
    //     l1.insert(12);
    //     l1.insert(6);
    //     l1.insert(4);
    //     l1.insert(1);
    //     System.out.println(l1.toString() + "\n");
    //
    // }
    //
    // public static void testGetSize() {
    //
    //     System.out.println("   1) Empty list\n");
    //     LinkedSortedList l1 = new LinkedSortedList(Integer.class);
    //     System.out.println(l1.getSize() + "\n");
    //
    //     System.out.println("   2) List with elements\n");
    //     l1.insert(4);
    //     l1.insert(3);
    //     l1.insert(2);
    //     l1.insert(1);
    //     System.out.println(l1.getSize() + "\n");
    //
    // }
    //
    // public static void testIsEmpty() {
    //
    //     System.out.println("   1) Empty list\n");
    //     LinkedSortedList l1 = new LinkedSortedList(Integer.class);
    //     System.out.println(l1.isEmpty() + "\n");
    //
    //     System.out.println("   2) List with elements\n");
    //     l1.insert(4);
    //     l1.insert(3);
    //     l1.insert(2);
    //     l1.insert(1);
    //     System.out.println(l1.isEmpty() + "\n");
    //
    // }
    //
    // public static void testToString() {
    //
    //     System.out.println("   1) Empty list\n");
    //     LinkedSortedList l1 = new LinkedSortedList(Integer.class);
    //     System.out.println(l1.toString() + "\n");
    //
    //     System.out.println("   2) List with elements\n");
    //     l1.insert(4);
    //     l1.insert(3);
    //     l1.insert(2);
    //     l1.insert(1);
    //     System.out.println(l1.toString() + "\n");
    //
    // }
    //
    // public static void testGetIterator() {
    //
    //     LinkedSortedList l1 = new LinkedSortedList(Integer.class);
    //
    //     if(l1.getIterator() != null) {
    //
    //         System.out.println("Iterator isn't null\n" );
    //
    //     } else {
    //
    //         System.out.print("Iterator is null\n");
    //
    //     }
    //
    // }
    //
    // public static void testHasNext() {
    //
    //     System.out.println("   1) Empty list\n");
    //     LinkedSortedList l1 = new LinkedSortedList(Integer.class);
    //     System.out.println(l1.getIterator().hasNext() + "\n");
    //
    //     System.out.println("   2) List with elements\n");
    //     l1.insert(4);
    //     l1.insert(3);
    //     l1.insert(2);
    //     l1.insert(1);
    //     System.out.println(l1.getIterator().hasNext() + "\n");
    //
    // }
    //
    // public static void testNext() {
    //
    //     System.out.println("   1) Empty list\n");
    //     LinkedSortedList l1 = new LinkedSortedList(Integer.class);
    //     System.out.println(l1.getIterator().hasNext() + "\n");
    //
    //     System.out.println("   2) List with elements\n");
    //     l1.insert(4);
    //     l1.insert(3);
    //     l1.insert(2);
    //     l1.insert(1);
    //     System.out.println(l1.getIterator().hasNext() + "\n");
    //
    // }
    //
    // public static void testRemove() {
    //
    //
    //
    //     System.out.println("   1) Empty list\n");
    //     LinkedSortedList l1 = new LinkedSortedList(Integer.class);
    //     Iterator itr = l1.getIterator();
    //     l1.getIterator().remove();
    //
    //     System.out.println("   2) List with elements\n");
    //     l1.insert(4);
    //     l1.insert(3);
    //     l1.insert(2);
    //     l1.insert(1);
    //     System.out.println(l1.toString() + "\n");
    //     l1.getIterator().next();
    //     l1.getIterator().remove();
    //     System.out.println(l1.toString() + "\n");
    //     l1.getIterator().next();
    //     l1.getIterator().remove();
    //     System.out.println(l1.toString() + "\n");
    //
    // }

}
