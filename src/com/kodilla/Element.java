package com.kodilla;

public class Element {

    String value;
    private Element next = null;
    private Element prev = null;

    public Element(String value, Element next, Element prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public String getValue() {
        return value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Element getPrev() {
        return prev;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }
}
