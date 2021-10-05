package me.study.object_oriented_programming2;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (car) fe; 에서 형변환이 생략
//        car.water(); // error Car 타입의 참조변수로는 water()을 사용할 수 없다.
        fe2 = (FireEngine) fe;
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrr~");
    }

    void stop() {
        System.out.println("stop!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!");
    }
}
