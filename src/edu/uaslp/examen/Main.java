package edu.uaslp.examen;

public class Main {

    public static void main(String[] args) {
        BookCollectionManager manager = new BookCollectionManager();

        BookCollection lordOfTheRings = manager.createCollection("El Señor de los Anillos");
        manager.createCollection("Harry Potter");

        Book book = buildBook("Pride and Prejudice", "8483433753", "Jane Austen", 5);

        manager.addBookToCollection("Jane Austen", book);

        lordOfTheRings.addBook(buildBook("El retorno del rey", "8445000683", "J. R. R. Tolkien", 4));
        lordOfTheRings.addBook(buildBook("Las dos torres", "8445000675", "J. R. R. Tolkien", 5));

        BookCollection harryPotter = manager.getCollectionByName("Harry Potter");

        harryPotter.addBook(buildBook("Harry Potter y la piedra filosofal", "6073193009", "J. K Rowling", 4));
        harryPotter.addBook(buildBook("Harry Potter y el cáliz de fuego", "978-8478886463", "J. K Rowling", 3));
        harryPotter.addBook(buildBook("Harry Potter y las reliquias de la muerte", "1644732130", "J. K Rowling", 5));

        System.out.println("Estrellas de la collección de Jane Austen: " + manager.getCollectionByName("Jane Austen").getStars());
        System.out.println("Estrellas de la collección de Harry Potter: " + manager.getCollectionByName("Harry Potter").getStars());

        System.out.println("Colecciones creadas:");
        for(String title: manager.getCollectionNames()){
            System.out.println(title);
        }

    }

    private static Book buildBook(String title, String isbn, String author, int stars) {
        Book book = new Book();

        book.setTitle(title);
        book.setIsbn(isbn);
        book.setAuthor(author);
        book.setStars((short) stars);

        return book;
    }
}
