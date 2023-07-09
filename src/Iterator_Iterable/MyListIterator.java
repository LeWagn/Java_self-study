package Iterator_Iterable;

import java.util.Iterator;
import java.util.List;

//implementing Iterator yourself:
//Have to implement Iterator<T> interface methods hasNext and next.

public class MyListIterator<T> implements Iterator<T> {

    private List<T> list = null;
    private int index = 0;

    public MyListIterator(List<T> list) {
        this.list = list;
    }

    //still have a next Element bc our index is smaller than the size of the List
    @Override
    public boolean hasNext() {
        return this.index < this.list.size();
    }

    //Get the next Element by using list.get at index and then increment index after obtaining the Element.
    @Override
    public T next() {
        return this.list.get(this.index++);
    }
    
}
