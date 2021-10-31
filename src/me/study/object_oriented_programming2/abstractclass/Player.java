package me.study.object_oriented_programming2.abstractclass;

abstract class Player {
    boolean pause;
    int currentPos;

    Player(boolean pause, int currentPos) {
        this.pause = pause;
        this.currentPos = currentPos;
    }

    abstract void play(int post);

    abstract void stop();

    void pause() {
        if (pause) {
            pause = false;
            play(currentPos); // 추상메서드를 호출 (즉 구현체마다 기능은 다르지만 시작한다는 목적은 같다.)
        } else {
            pause = true;
            stop();
        }
    }
}
