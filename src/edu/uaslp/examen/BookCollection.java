package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private String name;
    private List<Book> books = new ArrayList<>();

    public BookCollection(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }

    public Integer getStars(){
        int promedio = 0;
        for(Book book: books){
            promedio+=book.getStars();
        }
        promedio = promedio / books.size();
        return promedio;
    }
}
