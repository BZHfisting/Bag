import java.util.Iterator;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;

/**
* This is the main class
* @author NAVEAU Simon
*/

public class Bag<E> extends AbstractCollection<E> {

    Element sentinel;
    int size;
    int modCount = 0;

    /**
    * This constructor of the Bag class create an empty list and set it attributes
    */
    public Bag(){
        this.sentinel = new Element(null, null);
        this.sentinel.next = this.sentinel;
        this.size = 0;
        assert(this.size != 0) : "ERROR Bag() : size != 0";
        assert(this.sentinel == null) : "ERROR Bag() : sentinel == null ";
    }

    /**
    * The constructor of the class
    * @param c The list of all the "Element" to add in the new list
    */
    public Bag(Collection<E> c){
        assert(c == null) : "ERROR Bag(Collection<E>) : param c == null";
        this.sentinel = new Element(null, null);
        this.sentinel.next = this.sentinel;
        this.size = 0;

        for (E element : c) {
            this.add(element);
        }

    }

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
    * @param c The list of all the "Element" to add in the new list
    */
    public boolean add(E o) {

        boolean ret = false;
        int afterSize = this.size;

        if(sentinel.next == sentinel) {

            Element newElem = new Element(o, sentinel);
            sentinel.next = newElem;
            this.size++;

        } else {

            int index = 0 + (int)(Math.random()*(size) + 1);
            assert(index < 0) : "ERROR add() : index < 0";
            assert(index > this.size) : "ERROR add() : index > size";
            Itr it = new Itr();
            for(int i = 0; i<index; i++) {

                it.next();

            }

            Element newElem = new Element(o, it.current);
            it.pastCurrent.next = newElem;
            this.size++;

        }
        assert(afterSize <= this.size) : "ERROR add() : PostCondition size est incorrect";
        this.modCount++;
        return ret;

    }

    public String toString(){
        String ret = "";
        Element ref = this.sentinel.next;
        ret = ret + "sentinel";

        for(int i = 0; i < this.size; i++){
            ret = ret + "; " + ref.theValue;
            ref = ref.next;
        }

        return ret;

    }


    private class Element {

        public Element next ;
        public E theValue ;

        Element(E data, Element next) {

            if(sentinel != null){
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
            else{
                this.theValue = data;
                this.next = next;
            }
        }

        public E getValue(){
            return this.theValue;
        }
    }

    public class Itr implements Iterator<E> {
        public Element current;
        public Element pastCurrent;
        public int expectedModCount;

        /**
        * The constructor of the class
        */
        public Itr() {
            this.current = Bag.this.sentinel;
            this.pastCurrent = Bag.this.sentinel;
            this.expectedModCount = modCount;
        }

        /**
        * Returns true if the iterator is not at the end of the list.
        * @return true if the iterator is not at the end of the list.
        */
        public boolean hasNext() {
            boolean hasNext = false;
            if(this.expectedModCount == modCount){
                if(size != 0){
                    if (!(this.next().equals(Bag.this.sentinel))) {
                        hasNext = true;
                    }
                }
            }
            else{
                throw new ConcurrentModificationException();
            }
            return hasNext;
        }

        /**
        * Moves the iterator to its right neighboor and returns the data of the new element designated by current. The second cursor pastCurrent is placed just to the left of current.
        * @return The current object
        */
        public E next() {
            if(this.expectedModCount == modCount){
                this.pastCurrent = this.current;
                this.current = this.current.next;
            }
            else{
                throw new ConcurrentModificationException();
            }
            return this.current.theValue;
        }

        /**
        * Removes the element designated by the iterator. If the operation is possible (see description of class Itr below), then the current element will be placed on the element to its left (current and pastCurrent then point to the same element).
        */
        public void remove() {
            if(this.expectedModCount == modCount){
                if (this.current.equals(this.pastCurrent)) {
                    this.next();
                }
                this.pastCurrent.next = this.current.next;
                this.current = this.pastCurrent;
                size--;
                modCount++;
                this.expectedModCount = modCount;
            }
        }
    }
}
