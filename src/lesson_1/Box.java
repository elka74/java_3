package lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    public ArrayList<T> lists;

    public Box(T... lists) {
        this.lists = new ArrayList(Arrays.asList(lists));

    }

    public void addList(T... lists) {
        this.lists.addAll(Arrays.asList(lists));

    }

    public int getLists() {
        return lists.size();
    }


    public float getWeight() {
        float weight = 0.0f;
        for (T ls : lists) {
            weight = weight + ls.getWeight();
        }
        return weight;

    }

    public float compare(Box box) {
        if (this.getWeight() - box.getWeight() == 0) {
            System.out.println("Коробки имеют одинаковый вес");
        } else if (this.getWeight() - box.getWeight() > 0) {
            System.out.println("Первая коробка весит больше на " + (this.getWeight() - box.getWeight()) + " у.е");
        } else {
            System.out.println("Вторая коробка весит больше на " + Math.abs(this.getWeight() - box.getWeight()) + " у.е");
        }
        return Math.abs(this.getWeight() - box.getWeight());
    }

    public void shifting(Box<? super T> box) {
        box.lists.addAll(this.lists);
        lists.clear();

    }

}
