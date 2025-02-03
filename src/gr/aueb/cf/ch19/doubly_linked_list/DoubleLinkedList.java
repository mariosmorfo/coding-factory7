package gr.aueb.cf.ch19.doubly_linked_list;

public class DoubleLinkedList <T> {
    private Node<T> head = null;
    private Node<T> tail = null;

    public void insertFirst(T t){
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if(head == null) tail = tmp;

        head = tmp;
    }

    public void insertLast(T t){
        if(head == null) {
            insertFirst(t);
            return;
        }
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail.setNext(tmp);
        tail = tmp;
    }

}
