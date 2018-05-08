package com.kodilla;

public class Element {

    private String value;
    private Element next;
    private Element prev;

    public Element(String value) {
        this.value = value;
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
