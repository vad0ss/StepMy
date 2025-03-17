package by.Prileipishev.out.production.L_10_03_2025;

import by.Prileipishev.out.production.L_03_03_2025.Student.Student;
import by.Prileipishev.out.production.L_03_03_2025.Student.StudentFactory;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Student student = new Student("Дима", 22, 9);
        Student student2 = new Student("Андрей", 18, 7);
        Student student3 = new Student("Катя", 18, 8);

        Map<Integer, Student> ageToStudentMap = new HashMap<>();

        ageToStudentMap.put(student.getAge(), student);
        ageToStudentMap.put(student2.getAge(), student2);
        ageToStudentMap.put(student3.getAge(), student3);


        System.out.println(ageToStudentMap);

        Student getS = ageToStudentMap.get(18);

        System.out.println(getS);

        boolean containsStudent2 = ageToStudentMap.containsValue(student2);
        System.out.println(containsStudent2);

        Set<Integer> ages = ageToStudentMap.keySet();

        System.out.println(ages);

        Collection<Student> values = ageToStudentMap.values();

        for (Map.Entry<Integer, Student> entry : ageToStudentMap.entrySet()) {
            System.out.println(entry.getKey() + " := " + entry.getValue());
        }

        System.out.println(ageToStudentMap.getOrDefault(90, StudentFactory.next()));
        ageToStudentMap.putIfAbsent(92, StudentFactory.next());
        ageToStudentMap.remove(21);

        Map<Integer, List<Student>> ageStudentsMap = new HashMap<>();
        List<Student> students = new ArrayList<>();

        students.add(student);

        ageStudentsMap.put(student.getAge(), students);
        students.add(student2);

        List<Student> students2 = List.of(student, student2, student3);

        for (Student s: students2) {
            ageStudentsMap.putIfAbsent(s.getAge(), new ArrayList<>());
            List<Student> list = ageStudentsMap.get(s.getAge());
            list.add(s);
        }

        System.out.println(ageStudentsMap);

    }

}
