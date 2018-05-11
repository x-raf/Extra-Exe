package com.kodilla;

public class Runner {
    public static void main(String[] args) {
        StringCollection sc = new StringCollection();
        sc.addElement("Pierwszy");
        sc.addElement("Drugi");
        sc.addElement("Trzeci");
        sc.addElement("Czwarty");
        boolean r = sc.removeElement(0);
        System.out.println(r);
        String s = sc.getElement(2);
        System.out.println(s);
    }
}
