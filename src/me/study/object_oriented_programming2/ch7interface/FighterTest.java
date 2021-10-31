package me.study.object_oriented_programming2.ch7interface;

/*
인터페이스의 규칙
- 모든 멤버변수는 public static final 이여야 한다. (생략 가능)
- 모든 메서드는 public abstract 이어야 한다. (생략 가능) - 단 default method, static method 는 구체화 가능
- 생략한 문법은 컴파일 과정에서 추가 된다.
- 클래스와 달리 다중 상속 가능
 */
public class FighterTest {
    public static void main(String[] args) {

    }
}

class Fighter extends Unit implements Fightable {
    @Override
    public void attach(Unit u) {

    }

    @Override
    public void move(int x, int y) {

    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable {
    @Override
    void attach(Unit u);

    @Override
    void move(int x, int y);
}

interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attach(Unit u);
}
