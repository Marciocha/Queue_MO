package com.sdajava.queue;

/**
 * Created by user on 2017-03-09.
 */
public class QueElements {

    private QueueImpl first;
    private QueueImpl last;

    public QueElements(){
        first = last = null;
    }

    public QueueImpl getFirst() {
        return first;
    }

    public void setFirst(QueueImpl first) {
        this.first = first;
    }

    public QueueImpl getLast() {
        return last;
    }

    public void setLast(QueueImpl last) {
        this.last = last;
    }

    public void add(String value){

        //nowy element w kolejce

        QueueImpl queue = new QueueImpl(value); //tworzymy jeden kontener

        //jezeli kolejka jest pusta to element przychodzacy jest pierwszy

        if(first == null) {
            first = last = queue;
        }else{ //jezeli kolejka nie jest pusta to element przychodzacy jest ustawiany jako ostatni
            last.setNext(queue);//przesuwamy
            last = queue; //ustawiamy tego co przyszedl na koniec, ostatni ustawic na te co przyszedl
        }
    }

    public void show(){

        //wyswietlanie wartosci robimy w momencie kiedy pierwszy element nie jest wartoscia null

        if(first != null){

            //tworzymy wskaznik do obiektu

            QueueImpl element = first;
            //do momentu az bedzie wskaznik rozny od nulla to ja chce pobierac wartosci a jak pobiore wartosci to musze wskaznik przesunac
            while(element != null){
                System.out.println(element.getValue());
                element = element.getNext();
            }
        }}
    public void size(){

        //wyswietlanie wartosci robimy w momencie kiedy pierwszy element nie jest wartoscia null

        if(first != null) {

            //tworzymy wskaznik do obiektu

            QueueImpl element = first;
            //do momentu az bedzie wskaznik rozny od nulla to ja chce pobierac wartosci a jak pobiore wartosci to musze wskaznik przesunac
            int licznik = 0;
            while (element != null) {
                element = element.getNext();
                licznik++;
            }
            System.out.println(licznik);
        }
    }

}
