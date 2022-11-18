package chapter01;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoway();
        quackBehavior = new Quck();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck!");
    }
}
