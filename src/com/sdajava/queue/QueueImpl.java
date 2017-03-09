package com.sdajava.queue;

/**
 * Created by user on 2017-03-09.
 */
public class QueueImpl {

    private String value; //wartosc ktora bedziemy chcieli wlozyc do kolejki
    private QueueImpl next; //wskazujemy na nastepny element

    //tworzymy konstruktor

    public QueueImpl(String value){
        this.value = value; //przypisanie konstruktora do pola w klasie
        this.next = null; //wartosc nastepnego elementu ustawiona na null, przy inicjalizacji kolejki
    }

    public String getValue() {
        return value;
    }

    public QueueImpl getNext() {
        return next;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(QueueImpl next) {
        this.next = next;
    }
}
