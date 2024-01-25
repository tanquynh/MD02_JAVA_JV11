package bt13;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("A");
        list.add("B");
        list.add("C");

        list.printList();

        list.addFirst("D");
        list.addLast("E");

        list.printList();

        list.remove(2);

        list.printList();

        System.out.println("Size: " + list.size());

        System.out.println("Element at index 1: " + list.get(1));

        System.out.println("Contains C? " + list.contains("C"));

        System.out.println("Index of E: " + list.indexOf("E"));
        MyLinkedList clonedList = list.clone();
        clonedList.printList();
    }
}
