package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionManager {
    private String name;
    private List<BookCollection> collections = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookCollection> getCollections() {
        return collections;
    }

    public void setCollections(List<BookCollection> collections) {
        this.collections = collections;
    }

    public BookCollection createCollection(String name){
        BookCollection bookCollection = new BookCollection(name);

        collections.add(bookCollection);

        return bookCollection;

    }

    public BookCollection getCollectionByName(String name){
        for(BookCollection bookCollection: collections){
            if(name == bookCollection.getName()){
                return bookCollection;
            }
        }
        return null;
    }

    public BookCollection deleteCollectionByName(String name){
        int count = 0;

        for(BookCollection bookCollection: collections){
            count++;
            if(name == bookCollection.getName()){
                return collections.remove(count);
            }
        }
        return null;
    }

    public void addBookToCollection(String collectionName, Book book){
        for(int i=0; i<collections.size(); i++){
            if(collectionName == getName()){
                BookCollection bookCollection = new BookCollection(collectionName);
                collections.add(bookCollection);
            }else{
                createCollection(book.getTitle());
            }
        }

    }

    public List<String> getCollectionNames(){
        List<String> listNames = new ArrayList<>();

        for(int i= 0; i<collections.size(); i++){
            BookCollection list = collections.get(i);
            listNames.add(list.getName());
        }
        return listNames;
    }

}
