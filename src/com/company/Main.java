package com.company;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box();
        box1.depth = 1;
        box1.height = 2;
        box1.width = 3;

        int volume1 = box1.width * box1.height * box1.depth;
        System.out.println("Объем коробки №1 = " + volume1);

        Box box2 = new Box();
        box2.depth=2;
        box2.height=3;
        box2.width=4;
        int result = box2.depth* box2.height* box2.width;
        int summ = volume1+result;
        System.out.println("Объем коробки №2 = " + result);
        System.out.println("summ box2 + box1: "+summ);
    }
}

