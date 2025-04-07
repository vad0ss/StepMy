package by.Prileipishev.out.production.L_07_04_2025;

import java.io.*;
import java.util.Scanner;

public class Task00 {

    public static void main(String[] args) {
//        try (FileReader fileReader = new FileReader("file.txt")) {
//            int ch;
//            while ((ch = fileReader.read()) != -1) {
//                //System.out.print((char) ch);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        try (BufferedReader bufferedReader = new BufferedReader(
//                new FileReader("file.txt"))) {
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Ошибка чтения файла!");
//        }
//        File file = new File("file2.txt");
//
//        try (Scanner scanner = new Scanner(file)) {
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (IOException e) {
//            System.out.println("Файл не найден или повреждён");
//        }

        File file = new File("file2.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Привет я новая строка! \n");
        } catch (IOException e) {
            System.out.println("Неудалось записать в файл!");
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write("Buffered2");
            bufferedWriter.newLine();
            bufferedWriter.write("Buffered3");
        } catch (IOException e) {
            System.out.println("Неудалось записать в файл!");
        }

}

}
