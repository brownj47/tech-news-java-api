package com.technews;

public interface Movement {
    public void run();
    public void jump();

}

class Dog implements Movement{
    @Override
    public void run() {
        System.out.println("this dog can run a long time");
    }
    @Override
    public void jump() {
        System.out.println("this dog cannot jump very high");
    }
}
class Cat implements Movement{
    @Override
    public void run() {
        System.out.println("this cat cannot run a long time");
    }
    @Override
    public void jump() {
        System.out.println("this cat can jump very high");
    }
}
