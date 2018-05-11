package com.kodilla;

public class StringCollection {
    private Element collectionHead;

    public String getElement(int n){
        Element temp = collectionHead;
        int counter =0;
        while (temp.getNext() !=null && counter < n){
            temp=temp.getNext();
            counter++;
        }
        if (counter==n){
            return temp.getValue();
        }else {
            return null;
        }
    }
    public void addElement(String s){
        Element e = new Element(s);
        if(collectionHead==null) {
            collectionHead=e;
        }else {
            Element temp = collectionHead;
            while (temp.getNext() != null) {
                temp=temp.getNext();
            }
            temp.setNext(e);
            e.setPrev(temp);
        }
    }
    public boolean removeElement(int n){
        Element temp = collectionHead;
        int counter =0;
        while (temp.getNext() !=null && counter < n){
            temp=temp.getNext();
            counter++;
        }
        if (temp == collectionHead){
            collectionHead = collectionHead.getNext();
            if (collectionHead != null) {
                collectionHead.setPrev(null);
            }
        } else {
            if (counter == n) {
                if (temp.getNext() == null) {
                    temp.getPrev().setNext(null);
                } else {
                    temp.getPrev().setNext(temp.getNext());
                    temp.getNext().setPrev(temp.getPrev());
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
