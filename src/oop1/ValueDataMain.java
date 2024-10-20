package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();

        data.add();
        valueUp(data);
        valueUp(data);
        valueUp(data);
        data.add();
    }

    static void valueUp(ValueData data) {
        data.value++;
        System.out.println("value 증가 : " + data.value);
    }
}
