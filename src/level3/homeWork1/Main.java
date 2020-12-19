package level3.homeWork1;

import level3.homeWork1.fruits.Apple;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /*
    3. Большая задача:
    a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
    b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можете использовать ArrayList;
    d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес
    одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
    e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
    которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае
    (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
    (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно
     в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
    g. Не забываем про метод добавления фрукта в коробку.

     */
    public static void main(String[] args) {
        String[] array = {"ABC", "CDE", "FGH"};
        ArrayList<String> arrayList = arrayToList(array);
        System.out.println(arrayList);

        BoxWithFruits<Apple> box1 = new BoxWithFruits<>();
        box1.add(new Apple(1.0f));
    }
    /*
    2. Написать метод, который преобразует массив в ArrayList;
     */
    private static ArrayList<String> arrayToList(String[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
    /*
    1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
     */
    public static void swap1(Object[] array, int index1, int index2) {
        Object object = array[index1];
        array[index1] = array[index2];
        array[index2] = object;

    }

    public static <T> void swap2(T[] array, int index1, int index2) {
        T object = array[index1];
        array[index1] = array[index2];
        array[index2] = object;
    }
}
