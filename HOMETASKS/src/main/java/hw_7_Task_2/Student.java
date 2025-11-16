package hw_7_Task_2;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Student {
    private final int id;
    private final String name;
    private final int age;
    private final double gpa;

    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s', age=%d, gpa=%.2f}",
                id, name, age, gpa);
    }

    public static void addStudent(List<Student> students, Student student) {
        students.add(student);
    }

    public static List<Student> removeStudentById(List<Student> students, int id) {
        Iterator<Student> it = students.iterator();
        boolean removed = false;

        while (it.hasNext()) {
            Student s = it.next();
            if (s.getId() == id) {
                it.remove();
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Student with id=" + id + " not found.");
        } else {
            System.out.println("Student with id=" + id + " removed.");
        }

        return students;
    }

    public static Optional<Student> findStudentByName(List<Student> students, String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }

    public static void printAllStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("The list of students is empty.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}