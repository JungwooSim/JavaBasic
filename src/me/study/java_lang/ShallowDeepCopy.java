package me.study.java_lang;

public class ShallowDeepCopy {

    public static void main(String[] args) {
        Circle c1 = new Circle(new PointSecond(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c3="+c3);

        c1.p.x = 9;
        c1.p.y = 9;

        System.out.println("= c1의 변경 후 =");
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c3="+c3);
    }
}

class PointSecond {
    int x, y;

    PointSecond(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "("+x+", "+y+")";
    }
}

class Circle implements Cloneable {
    PointSecond p;
    double r;

    public Circle(PointSecond p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {

        }

        return (Circle) obj;
    }

    public Circle deepCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}

        Circle c = (Circle)obj;
        c.p = new PointSecond(this.p.x, this.p.x);

        return c;
    }

    public String toString() {
        return "[P=" + p + ", r=" + r +"]";
    }
}




