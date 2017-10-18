
import java.util.*;

public class BagTest {

    public static void main(String[] args) {
        Integer[][] indexOccurences = new Integer[10][10];
        Arrays.fill(indexOccurences, 0);
        Bag bag1 = new Bag();
        int nbExp = 0;
        for (int exp = 0; exp < nbExp; exp++) {
            bag1.add(new Integer(1));
            bag1.add(new Integer(2));
            bag1.add(new Integer(3));
            bag1.add(new Integer(4));
            bag1.add(new Integer(5));
            bag1.add(new Integer(6));
            bag1.add(new Integer(7));
            bag1.add(new Integer(8));
            bag1.add(new Integer(9));
            bag1.add(new Integer(10));

            Iterator it = bag1.iterator();
            int index = 0;
            while (it.hasNext()) {
                indexOccurences[it.getValue()-1][index]++;
                index++;
                it.next();
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
