package by.Prileipishev.out.production.L_03_02_2025.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library(1);

        Author tolkien = new Author("Джон", "Толкин", 1892);
        Author koeljo = new Author("Пабло", "Коэльо", 1972);
        Author safonova = new Author("Татьяна", "Сафонова", 1969);

        Book lordOfTherings = new Book("Властелин колец", tolkien, 1955, BookTypes.FANTASTIC);
        Book dar = new Book("Высший дар", koeljo, 1995, BookTypes.ROMAN);
        Book strana = new Book("Страна конструктивизма", safonova, 2005, BookTypes.PUBLICISTIKA);
        Ebook eBook = new Ebook("Властелин колец", tolkien, 1955, BookTypes.FANTASTIC, 18.76);

        library.addBook(lordOfTherings);
        library.addBook(dar);
        library.addBook(strana);

        System.out.println(eBook.getDescription());

        System.out.println("Все книги:");
        library.printBooks();
        System.out.println("==============================");

        System.out.println("Поиск книги 'Властелин колец':");
        System.out.println(library.findBook("Властелин колец"));
        System.out.println("==============================");

        System.out.println("Книги после сортировки по году издания:");
        library.sortBooksByYear();
        library.printBooks();
        System.out.println("==============================");

        System.out.println("Книги после сортировки по году рождения автора:");
        library.sortBooksByAuthorBirthYear();
        library.printBooks();

        System.out.println("==============================");
        System.out.println(eBook);
    }

}
