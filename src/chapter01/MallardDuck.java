package chapter01;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quck();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck!");
    }
}
