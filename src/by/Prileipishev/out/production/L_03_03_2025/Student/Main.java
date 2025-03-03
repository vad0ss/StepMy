package by.Prileipishev.out.production.L_03_03_2025.Student;

import by.Prileipishev.out.production.L_03_03_2025.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            students.add(StudentFactory.next());
        }
    }


    public static Student search(List<Student> students, Student student) {
        for (Student s : students) {
            if (s.equals(student)) {
                return student;
            }
        }

        return null;
    }

    public static void removeByName(List<Student> students, String name) {

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student next = iterator.next();

            if (next.getName().equals(name)) {
                iterator.remove();
            }
        }
    }

    public static void addList(List<Student> students_1, List<Student> students_2) {
        students_1.addAll(students_2);
    }

    public static void replace(List<Student> students, int index) {

    }

}
