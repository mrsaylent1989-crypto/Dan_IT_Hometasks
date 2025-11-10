package hw_6_1.task_1;

public class main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Fish fish = new Fish();
        Dog dog = new Dog();

        System.out.println(bird.eat());
        System.out.println(bird.i_sleep());
        System.out.println(bird.fly());
        System.out.println("|-------------------------|");
        System.out.println(fish.eat());
        System.out.println(fish.i_sleep());
        System.out.println(fish.swim());
        System.out.println("|-------------------------|");
        System.out.println(dog.eat());
        System.out.println(dog.i_sleep());
        System.out.println(dog.bark());
    }
}
