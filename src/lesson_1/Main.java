package lesson_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple(1.0f);
        Apple apple2 = new Apple(1.0f);
        Apple apple3 = new Apple(1.0f);
        Orange orange1 = new Orange(1.5f);
        Orange orange2 = new Orange(1.5f);
        Orange orange3= new Orange(1.5f);
        Box<Apple> box1 = new Box(apple1, apple2, apple3);
        Box<Orange> box2 = new Box(orange1, orange2, orange3);

        System.out.println("Яблок в коробке: " + box1.getLists() + " штук(и)");
        System.out.println("Вес коробки с яблоками: " +box1.getWeight() + " у.е");
        System.out.println("Апельсин в коробке: " + box2.getLists() + " штук(и)");
        System.out.println("Вес коробки с апельсигами: " +box2.getWeight() + " у.е");
        System.out.println(box1.compare(box2));
    }
}
