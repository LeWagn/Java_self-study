package Iterator_Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomArrayList<T> implements Iterable<T> {

    private List<T> myList = new ArrayList<>();

    public void add(T val) {
        myList.add(val);
    }


    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<T>(myList);
    }

    public class CustomIterator<E> implements Iterator<E> {

        int indexPosition = 0;
        List<E> internalList;

        public CustomIterator(List<E> internalList) {
            this.internalList = internalList;
        }

        @Override
        public boolean hasNext() {
            return indexPosition < internalList.size();
        }

        @Override
        public E next() {
            //this would just move up position by position.
            return this.internalList.get(this.indexPosition++);

            //if I instead want to for example iterate through every square element, i could write:
            //E temp = this.internalList.get(this.indexPosition * this.indexPosition);
            //indexPosition++;
            //return temp;
            //The iterated Elements would be at index: 0, 1, 4, 9, 16 etc.
        }
        
    }
    
}
