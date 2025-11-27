package Task_3;

public class main {

    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal cat = factory.createAnimal("cat");
        Animal dog = factory.createAnimal("dog");
        Animal bird = factory.createAnimal("bird");

        cat.speak();
        dog.speak();
        bird.speak();
    }

}
