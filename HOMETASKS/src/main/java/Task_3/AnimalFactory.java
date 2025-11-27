package Task_3;

public class AnimalFactory {

    public Animal createAnimal(String Animaltype){
        switch (Animaltype){
            case "dog":
                return new dog();
            case "cat":
                return new cat();
            case "bird":
                return new bird();
            default:
                return null;
        }
    }
}
