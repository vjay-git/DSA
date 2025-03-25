package org.example;



public class Main {
    public static void main(String[] args)
    {
        Cookie cookieOne = new Cookie("red");
        Cookie cookieTwo = new Cookie("blue");
        cookieTwo.setColor("yellow");
        System.out.println(cookieTwo.getColor());
        System.out.println(cookieOne.getColor());
    }
}