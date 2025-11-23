package Task_2;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Person person1 = new Person("Vitaliy", "Fedorov", 35);
        Person person2 = new Person("Vitaliy", "Fedorov", 35);
        Person person3 = new Person("Alex", "Kirilov", 35);
        Person person4 = new Person("Alex", "Kirilov", 35);
        Person person5 = new Person("Nastya", "Amethist", 35);

        Set<Person> persons = new HashSet<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        System.out.println(persons);
        //collection size
        System.out.println(persons.size());
        //removing an item from a collection
        System.out.println(persons.remove(person3));
        //checking for the presence of an element in a collection
        System.out.println(persons.contains(person1));
    }
}
