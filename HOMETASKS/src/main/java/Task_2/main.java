package Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Person person1 = new Person("Vitaliy", "Fedorov", 35, 25000);
        Person person2 = new Person("Alex", "Fedorov", 41, 35000);
        Person person3 = new Person("Afanasiy", "Karasev", 75, 5000);
        Person person4 = new Person("Vera", "Klubnikina", 77, 85000);
        Person person5 = new Person("Lena", "Osenaya", 33, 22000);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        List<String> newPersons = persons.stream().filter(person -> person.getAge() < 70)
                .map(person -> person.getName()).collect(Collectors.toList());

        System.out.println(newPersons);
    }
}
