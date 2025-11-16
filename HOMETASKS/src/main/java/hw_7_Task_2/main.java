package hw_7_Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class main {
    public static void main(String[] args) {

        System.out.println("Student management system");

        List<Student> students = new ArrayList<>();

        // Добавляем 5 студентов
        Student.addStudent(students, new Student(1, "Oleg", 20, 3.5));
        Student.addStudent(students, new Student(2, "Maria", 19, 4.2));
        Student.addStudent(students, new Student(3, "Ivan", 21, 3.9));
        Student.addStudent(students, new Student(4, "Anna", 20, 4.5));
        Student.addStudent(students, new Student(5, "Petro", 22, 2.8));

        System.out.println("List of students:");
        Student.printAllStudents(students);

        System.out.println("\nRemove student from id=3");
        Student.removeStudentById(students, 3);
        Student.printAllStudents(students);

        System.out.println("\nSearch for a student named 'Maria':");
        Optional<Student> found = Student.findStudentByName(students, "Maria");
        System.out.println(found.map(Student::toString).orElse("Student not found"));

        System.out.println("\nSearch for a student named 'Ivan':");
        System.out.println(
                Student.findStudentByName(students, "Ivan")
                        .map(Student::toString)
                        .orElse("Student not found")
        );
    }
}
