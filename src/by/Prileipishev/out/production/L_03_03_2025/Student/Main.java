package by.Prileipishev.out.production.L_03_03_2025.Student;

import by.Prileipishev.out.production.L_03_03_2025.Car;

import java.util.*;

public class Main  {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            students.add(StudentFactory.next());
        }

        sortByComparator(students, new StudentNameComparator());

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

    public static void addList(List<Student> students1, List<Student> students2) {
        students1.addAll(students2);
    }

    public static void replace(List<Student> students, int index, Student student) {
        if (students.size() < index || index < 0) {
             return;
        }
        students.set(index, student);
    }

    private static void sortArray(List<Student> students) {
        Collections.sort(students);
    }

    private static void sortByComparator(List<Student> students, Comparator<Student> comparator) {
        students.sort(comparator);
    }

}
