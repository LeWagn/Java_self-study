package DynArray.Bro_Code;

public class DynamicArray {
    
    //usually private
    int size;
    int capacity = 10;
    Object[] array;

    //Standard Konstruktor mit unserer capacity (hier 10)
    public DynamicArray() {
        this.array = new Object[capacity];
    }

    //Konstruktor bei der der Anwender eine eigene capacity festlegen kann.
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        //Nehemn unseren Array am Ende (index von size) und fügen dort unser data object ein.
        array[size] = data;
        size++;
    }
    
    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        //Iteriere Rückwärts über Elemente im Array bis ich vorne angekommen bin.
        for (int i = size; i > index; i--) {
            //shifte alle Elemente eins nach rechts um platz für Insertion zu schaffen.
            array[i] = array[i - 1];
        }
        //Füge neues Element vorne (am index 0) ein und erhöhe size um 1.
        array[index] = data;
        size++;
    }
    
    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            //Iterieren und checken ob array an der Stelle i gleich dem Übergebenen Datenobjekt ist.
            if (array[i] == data) {
                //Müssen alle Elemente nach dem gelöschten Element nach links verschieben.
                //Iterieren solange laufindex j kleiner als size - laufindex i -1 ist.
                for (int j = 0; j < (size - i - 1); j++) {
                    //weißen Element an stelle i + j den Wert vom Element rechts daneben zu.
                    array[i + j] = array[i + j + 1];
                }
                //setzen das letzte Element (welches wir ja schon um eins nach links kopiert haben) gleich null.
                //size -1, da Arrays bei 0 anfangen, size aber bei 1. 
                array[size - 1] = null;
                size--;
                //checken ob die size kleiner als unser Shrink Kriterium gefallen ist (hier 1/3 der Kapazität).
                if (size <= (int) (capacity / 3)) {
                    shrink();
                }
                break;
            }
        }

    }
    
    public int search(Object data) {
        //Iterieren durch den array und vergleichen jede Stelle mit dem übergebenen Data-Objekt. Sobald gefunden returnen wir es. 
        //Falls nicht vorhanden: return -1 (Könnte hier auch ne NoSuchElementException werfen.)
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        //erhöhen Kapazität um faktor 2, casten als int.
        int newCapacity = (int) (capacity * 2);
        //Erstelllen neuen Array
        Object[] newArray = new Object[newCapacity];
        //Kopieren Elemente vom alten in den neuen Array:
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    
    //Identisch zu grow, bis auf /2 statt *2.
    private void shrink() {
        //verringern Kapazität um faktor 2, casten als int.
        int newCapacity = (int) (capacity / 2);
        //Erstelllen neuen Array
        Object[] newArray = new Object[newCapacity];
        //Kopieren Elemente vom alten in den neuen Array:
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    //abgeändert, damit man den ganzen array (inklusive nicht belegeter Stellen) sehen kann, indem man im for loop capacity statt size als abbruchbed. nimmt.
    public String toString() {
        String string = "";
        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        //Code um das letzte Komm wegzukriegen und [] hinzuzufügen
        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }
}
