package by.Prileipishev.out.production.L_06_03_2025;

import by.Prileipishev.out.production.L_03_03_2025.Student.Student;
import by.Prileipishev.out.production.L_03_03_2025.Student.StudentFactory;

import java.util.*;

public class Task00 {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Set<Student> studentsLinked = new LinkedHashSet<>();
        Set<Student> studentsTreeSet = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            Student next = StudentFactory.next();
            System.out.println(next);
            students.add(next);
            studentsLinked.add(next);
            studentsTreeSet.add(next);
        }

        System.out.println(students);
        System.out.println(students.size());
        System.out.println(studentsLinked);
        System.out.println(studentsTreeSet);
    }
}
