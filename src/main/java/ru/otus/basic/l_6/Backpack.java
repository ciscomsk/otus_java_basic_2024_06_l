package ru.otus.basic.l_6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Backpack {
    private String[] items = new String[5];

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println(item + " was put in the backpack");
                return;
            }
        }
        System.out.println("There is no room in the backpack");
    }

    public void remove(String item) {
        for (int i = 0; i < items.length; i++) {
            if(item.equals(items[i])) {
                items[i] = null;
                System.out.println(item + " was taken out of the backpack");
                return;
            }
        }
        System.out.println("there is no " + item + " in the backpack");
    }

    public void print() {
        String[] nonNullItems = Arrays.stream(this.items).filter(Objects::nonNull).toArray(String[]::new);
        System.out.println(Arrays.toString(nonNullItems));
    }

    public long count() {
        return Arrays.stream(this.items).filter(Objects::nonNull).count();
    }
}
