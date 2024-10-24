package poly.basic.ex3;

import poly.basic.ex2.Animal;
import poly.basic.ex2.Dog;

public class AbstractMain {

    public static void main(String[] args) {
        // 추상클래스는 인스턴스 생성 불가
        // AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

    }
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
