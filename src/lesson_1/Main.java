package lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1

        Integer[] mas = new Integer[4];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 3 * i;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        change(mas, 1, 3);
        System.out.print(Arrays.deepToString(mas) + "\n");


        //Задание 2
        ArrayList<Integer> arr = new ArrayList<>(arrayConversion(mas));
        System.out.println(arr + "\n");


        //Задание 3.

        Apple apple1 = new Apple(1.0f);
        Apple apple2 = new Apple(1.0f);
        Apple apple3 = new Apple(1.0f);
        Apple apple4 = new Apple(1.0f);
        Apple apple5 = new Apple(1.0f);
        Apple apple6 = new Apple(1.0f);
        Apple apple7 = new Apple(1.0f);
        Orange orange1 = new Orange(1.5f);
        Orange orange2 = new Orange(1.5f);
        Orange orange3 = new Orange(1.5f);
        Box<Apple> box1 = new Box(apple1, apple2, apple3);
        Box<Orange> box2 = new Box(orange1, orange2, orange3);
        Box<Apple> box3 = new Box<>(apple4, apple5);

        System.out.println("Яблок в коробке 1: " + box1.getLists() + " штук(и)");
        System.out.println("Вес коробки с яблоками: " + box1.getWeight() + " у.е");
        System.out.println("Апельсин в коробке 2: " + box2.getLists() + " штук(и)");
        System.out.println("Вес коробки с апельсигами: " + box2.getWeight() + " у.е");
        System.out.println(box1.compare(box2));
        box3.shifting(box1);
        System.out.println("Яблок в коробке 3 : " + box3.getLists() + " штук(и)");
        System.out.println("Яблок в коробке 1: " + box1.getLists() + " штук(и)");
        box3.addList(apple6, apple7);
        System.out.println("Яблок в коробке 3 : " + box3.getLists() + " штук(и)");
    }

    //Заданеи 1.
    public static Object[] change(Object[] mas, int indx, int indy) {
        Object t = mas[indx];
        mas[indx] = mas[indy];
        mas[indy] = t;
        return (mas);
    }

    //Заданеи 2.
    public static <T> ArrayList<T> arrayConversion(T[] conversion) {
        return new ArrayList<T>(Arrays.asList(conversion));

    }
}
