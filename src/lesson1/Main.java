package lesson1;

public class Main {
    public static void main(String[] args) {


    }
    private void exBoxGen(){
        BoxGen<Integer> bgi1 = new BoxGen<>(10);
        BoxGen<Integer> bgi2 = new BoxGen<>(20);

        int sum = bgi1.getObj() + bgi2.getObj();
        System.out.println(sum);

        BoxGen<String> bs = new BoxGen<>("java");
        System.out.println(bgi1.getClass());
        System.out.println(bs.getClass());

    }

    private void exSimpleBox(){
        SimpleBox box1 = new SimpleBox(10);
        SimpleBox box2 = new SimpleBox(20);

        box1.setObject(78);

        if(box1.getObject() instanceof Integer && box2.getObject() instanceof Integer ) {
            int sum = (int) box1.getObject() + (int) box2.getObject();
            System.out.println(sum);
        }

    }
}
