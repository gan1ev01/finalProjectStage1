import enums.Genre;
import enums.Language;
import model.Book;
import service.impl.BookServiceImpl;
import service.impl.UserServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.

        Book book = new Book(12356484456L,"Books1", Genre.ROMANCE, BigDecimal.valueOf(250),"Nursultan Ganiev", Language.KYRGYZ, LocalDate.of(2022,12,15));
        Book book1 = new Book(2L,"Books1", Genre.DETECTIVE, BigDecimal.valueOf(250),"Nursultan Ganiev", Language.KYRGYZ, LocalDate.of(2022,12,15));
        Book book2 = new Book(3L,"Books1", Genre.FANTASY, BigDecimal.valueOf(250),"Nursultan Ganiev", Language.KYRGYZ, LocalDate.of(2022,12,15));
        Book book3 = new Book(4L,"Books1", Genre.HISTORICAL, BigDecimal.valueOf(250),"Nursultan Ganiev", Language.KYRGYZ, LocalDate.of(2022,12,15));
        Book book4 = new Book(5L,"Books1", Genre.DETECTIVE, BigDecimal.valueOf(250),"Nursultan Ganiev", Language.KYRGYZ, LocalDate.of(2022,12,15));
        Book book5 = new Book(6L,"Books1", Genre.ROMANCE, BigDecimal.valueOf(250),"Nursultan Ganiev", Language.KYRGYZ, LocalDate.of(2022,12,15));
        Book book6 = new Book(7L,"Books1", Genre.DETECTIVE, BigDecimal.valueOf(250),"Nursultan Ganiev", Language.KYRGYZ, LocalDate.of(2022,12,15));
        Book book7 = new Book(8L,"Books1", Genre.FANTASY, BigDecimal.valueOf(250),"Nursultan Ganiev", Language.KYRGYZ, LocalDate.of(2022,12,15));
        Book book8 = new Book(9L,"Books1", Genre.HISTORICAL, BigDecimal.valueOf(250),"Nursultan Ganiev", Language.KYRGYZ, LocalDate.of(2022,12,15));
        Book book9 = new Book(10L,"Books1", Genre.DETECTIVE, BigDecimal.valueOf(250),"Nursultan Ganiev", Language.KYRGYZ, LocalDate.of(2022,12,15));
        Book book10 = new Book(11L,"Books1", Genre.FANTASY, BigDecimal.valueOf(250),"Nursultan Ganiev", Language.KYRGYZ, LocalDate.of(2022,12,15));

        List<Book> books = new ArrayList<>(List.of(book,book1,book2,book3,book4,book5,book6,book7,book8,book9,book10));

        BookServiceImpl bookService = new BookServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        while (true) {
            System.out.println("""
                               >>>>>>>> Write command <<<<<<<
                               1. - Create Books.
                               2. - GetallBooks.
                               3. - BooksByGenre.
                               4. - RemoveBookId
                    
                    
                    
                               """);

            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> bookService.createBooks(books);
                case 2 -> {
                    for (Book book11 : bookService.getAllBooks()) {
                        System.out.println("Everyone's list is out");
                        System.out.println(book);

                    }
                }
                case 3 -> {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Write the name to find that Genre.");
                    String name = scanner1.nextLine();
                    bookService.getBooksByGenre(Genre.ROMANCE.name()).forEach(System.out::println);
                }
                case 4 -> {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Write book name to remove it.");
                    String name = scanner1.nextLine();
                    bookService.removeBookById(book7.getId());
                }
            }
        }
    }
}