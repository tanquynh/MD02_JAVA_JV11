package bt13;

public class MyLinkedList {
    private int numNodes;
    private Node head;

    public MyLinkedList() {
        numNodes = 0;
        head = null;
    }
    public class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        numNodes++;
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        numNodes++;
    }

    public void addLast(Object data) {
        add(data);
    }

    public void remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }
            Node nextNode = currentNode.getNext();
            currentNode.setNext(nextNode.getNext());
        }
        numNodes--;
    }

    public void remove(Object data) {
        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                if (prevNode == null) {
                    head = currentNode.getNext();
                } else {
                    prevNode.setNext(currentNode.getNext());
                }
                numNodes--;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    public int size() {
        return numNodes;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public MyLinkedList clone() {
        MyLinkedList clonedList = new MyLinkedList();
        Node currentNode = head;

        while (currentNode != null) {
            clonedList.addLast(currentNode.getData());
            currentNode = currentNode.getNext();
        }

        return clonedList;
    }

    public boolean contains(Object data) {
        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }

        return false;
    }

    public int indexOf(Object data) {
        Node currentNode = head;
        int index = 0;

        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                return index;
            }
            currentNode = currentNode.getNext();
            index++;
        }

        return -1;
    }
}



