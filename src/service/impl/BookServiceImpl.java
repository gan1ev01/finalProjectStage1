package service.impl;

import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookServiceImpl implements BookService {
    List<Book> books = new ArrayList<>();
    @Override
    public List<Book> createBooks(List<Book> books) {
        System.out.println("All books are created");
        return List.copyOf(createBooks(books));
    }

    @Override
    public List<Book> getAllBooks() {
        return getAllBooks();
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        List<Book> books1 = new LinkedList<>();
        for (Book book : this.books) {
            if (book.getGenre().name().equals(books))
                books1.add(book);
        }

        return books1;
    }

    @Override
    public Book removeBookById(Long id) {
        for (Book book : books) {
            if (book.getId().equals(removeBookById(2L)));
            books.remove(book);
        }
        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        return null;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        return null;
    }

    @Override
    public Book maxPriceBook() {
        System.out.println();
        return null;
    }
}
