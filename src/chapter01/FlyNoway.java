package chapter01;

public class FlyNoway implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can not fly!");
    }
}
