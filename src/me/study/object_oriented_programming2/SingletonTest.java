package me.study.object_oriented_programming2;

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton(); // error
        Singleton s = Singleton.getInstance();
    }
}

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (s==null)
            s = new Singleton();

        return s;
    }
}
