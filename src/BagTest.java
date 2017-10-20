
import java.util.*;

/**
  * This class tests the balance of the placement of each value, from 1 to 10, 1000 times.
  */
public class BagTest {

    /**
      * Launches the test.
      * @param args the arguments from the console
      */
    public static void main(String[] args) {
        int[][] indexOccurences = new int[10][10];
        Bag bag1 = new Bag();
        int nbExp = 1000;
        for (int exp = 0; exp < nbExp; exp++) {
            bag1.add(1);
            bag1.add(2);
            bag1.add(3);
            bag1.add(4);
            bag1.add(5);
            bag1.add(6);
            bag1.add(7);
            bag1.add(8);
            bag1.add(9);
            bag1.add(10);

            Iterator it = bag1.iterator();
            int index = 0;
            while (it.hasNext()) {
                indexOccurences[(int)it.next()-1][index]++;
                index++;
            }

            bag1.clear();
        }

        for (int i = 0; i < indexOccurences.length; i++) {
            System.out.println("Placements de " + i+1 + " : ");
            for (int j = 0; j < indexOccurences.length; j++) {
                System.out.println("[" + indexOccurences[i][j] + "]\t");
            }
            System.out.println("\n");
        }
    }
}
