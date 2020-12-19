package level3.homeWork1;

import level3.homeWork1.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithFruits<T extends Fruit> {
    private List<T> container;

    public BoxWithFruits(List<T> container) {
        this.container = new ArrayList<>();
    }

    public BoxWithFruits(T... fruits) {this.container = new ArrayList(Arrays.asList(fruits));}

    //вычисление веса
    public float getWeight(){
        float weight = 0.0f;
        for(T fruit : container) {
            weight += fruit.getWeigth();
        }
        return weight;
    }
    public boolean saveAvg(BoxWithFruits<?>  another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.001;
    }
    //Перекидывание из одной коробки в другую
    public void transfer(BoxWithFruits<? super T> another) {
        if(another == this) {
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }

    public void add(T fruit){
        container.add(fruit);
    }
}
