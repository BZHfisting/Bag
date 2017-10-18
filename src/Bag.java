import java.util.Iterator;
import java.util.AbstractCollection;

/**
* This is the main class
* @author NAVEAU Simon
*/

public class Bag<E> extends AbstractCollection<E> {

    Element sentinel;
    int size;

    /**
    * This constructor of the Bag class create an empty list and set it attributes
    */
    public Bag(){
        this.sentinel = new Element(null, null);
        this.sentinel.next = this.sentinel;
        this.size = 0;
        assert(this.size != 0) : "ERROR Bag() : size != 0";
        assert(this.sentinel == null) : "ERROR Bag() : sentienl == null ";
    }

    /**
    * The constructor of the class
    * @param c The list of all the "Element" to add in the new list
    */
    // public Bag(Collection<E> c){
    //     assert(c == null) : "ERROR Bag(Collection<E>) : param c == null";
    //     this.sentinel = new Element(null, null);
    //     this.sentinel.next = this.sentinel;
    //     this.size = 0;
    //
    //     for (E element : c) {
    //         this.add(element);
    //     }
    //
    // }

    /**
    * Create a Itr object on the list and return it.
    * @return The new Itr
    */
    public Iterator<E> iterator(){
        return new Itr();
    }

    /**
    * The constructor of the class
    */
    public int size(){
        return this.size;
    }

    /**
    * The constructor of the class
    */
    public boolean add(E o){
        assert(o == null) : "ERROR add() : o == null";

        boolean ret = true;
        int afterSize = this.size;
        int index = -1;

        if(this.size > Integer.MAX_VALUE){
            ret = false;
        }

        index = (int) Math.random()*this.size;

        assert(index < 0) : "ERROR add() : index < 0";
        assert(index > this.size) : "ERROR add() : index > size";

        Element ref = this.sentinel;
        boolean trouve = false;
        int i = 0;

        while(i != index){
            ref = ref.next;
        }
        if(index == 0){
            Element newElem = new Element(o, this.sentinel.next);
            this.sentinel.next = newElem;
            this.size++;
        }
        else{
            Element newElem = new Element(o, ref.next);
            ref.next = newElem;
            this.size++;
        }

        assert(afterSize <= this.size) : "ERROR add() : PostCondition size est incorrect";

        return ret;
    }


    private class Element {

        Element next ;
        E theValue ;

        Element(E data, Element next) {

            if(next == null){
                throw new RuntimeException ("Pré-condition violée : next est egal a null lors de la creation de l'Element !") ;
            }
            else if(data == null){
                throw new RuntimeException ("Pré-condition violée : data est egal a null lors de la creation de l'Element !") ;
            }
            else{
                this.theValue = data;
                this.next = next;
            }
        }
    }

    public class Itr implements Iterator<E> {
        Element current;
        Element pastCurrent;

        /**
        * The constructor of the class
        */
        public Itr() {
            this.current = Bag.this.sentinel;
            this.pastCurrent = Bag.this.sentinel;
        }

        /**
        * Returns true if the iterator is not at the end of the list.
        * @return true if the iterator is not at the end of the list.
        */
        public boolean hasNext() {
            boolean hasNext = true;
            if (this.next().equals(Bag.this.sentinel)) {
                hasNext = false;
            }
            return hasNext;
        }

        /**
        * Moves the iterator to its right neighboor and returns the data of the new element designated by current. The second cursor pastCurrent is placed just to the left of current.
        * @return The current object
        */
        public E next() {
            this.pastCurrent = this.current;
            this.current = this.current.next;
            return this.current.theValue;
        }

        /**
        * Removes the element designated by the iterator. If the operation is possible (see description of class Itr below), then the current element will be placed on the element to its left (current and pastCurrent then point to the same element).
        */
        public void remove() {
            if (this.current.equals(this.pastCurrent)) {
                this.next();
            }
            this.pastCurrent.next = this.current.next;
            this.current = this.pastCurrent;
        }
    }


}
