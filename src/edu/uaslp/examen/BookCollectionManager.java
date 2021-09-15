package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionManager {

    private List<BookCollection> collections = new ArrayList<>();

    public BookCollection createCollection(String name){
        BookCollection bookCollection = new BookCollection(name);

        collections.add(bookCollection);

        return bookCollection;

    }

    public BookCollection getCollectionByName(String name){
        for(BookCollection bookCollection: collections){
            if(name == bookCollection.getName()){  ///
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
        BookCollection bookCollection = getCollectionByName(collectionName);

        if(bookCollection == null){
            bookCollection = createCollection(collectionName);
        }

        bookCollection.addBook(book);

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
