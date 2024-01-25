package bt12;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY =10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapacity() {
        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements,newSize);
    }
    // Phương thức add vào cuối danh sách
    public boolean add(E e) {
        if(size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
        return true;
    }
    // Phương thức add va vị trí index;
    public void add(int index, E e) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index :" + index + " Size" + size);
        }
        if(size == elements.length){
            ensureCapacity();
        }
        System.arraycopy(elements, index, elements, index+1, size-index);
        elements[index] = e;
        size++;
    }
    public E remove (int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index :" + index + " Size" + size);
        }
        System.arraycopy(elements,index+1,elements,index,size-1-index);
        elements[size -1] = null;
        return (E)elements[index];
    }
        public int size() {
        return size;
        }

        public E clone() {
        return (E)elements;
        }

        public boolean contains(E o) {
            return indexOf(o) != -1;
        }

        public int indexOf(E e) {
             if(e == null) {
                 for (int i = 0; i < size; i++) {
                     if(elements[i] == null);
                     return i;
                 }
             } else {
                 for (int i = 0; i < size; i++) {
                     if(e.equals(elements[i])){
                         return i;
                     }
                 }
             }
             return -1;
        }


    public E get(int index) {
        if(index < 0 || index >=size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }
    public void clear() {
        Arrays.fill(elements,0,size,null) ;
            size = 0;

    }

}
