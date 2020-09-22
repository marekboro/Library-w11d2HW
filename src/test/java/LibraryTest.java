
/*
Homework
DONE:
Create your own library class with an internal collection of books.
Books should have title, author and genre.
Write a method to add a book to the library stock.
Add a capacity to the library and write a method to check if stock is full before adding a book.
Write a method to count the number of books in the library.
Extensions:
Add a third class which interacts with the other two. E.g. you could add a Borrower with a method that takes a Book and moves to the Borrower's collection.

TO DO:

Advanced Extension
The library wants to keep track of it's number of books by genre. Using a HashMap, store the genre of each book as the key - and a count of how many books of that genre as the value.
*/

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;


    @Before
    public void before() {
        library = new Library(4);
        book1 = new Book("Blood of the Elves", "Andrzej Sapkowski", "Fantasy");
        book2 = new Book("Dune", "Frank Herbert", "Fantasy");
        book3 = new Book("Art of War", "Sun Tzu", "Military art");
        book4 = new Book("The Gulag Archipelago", "Aleksandr Solzhenitsyn", "History");
        book5 = new Book("12 Rules for Life: An Antidote to Chaos ", "Jordan Peterson", "Self Development");
    }

    @Test
    public void LibraryHasCapacity() {
        assertEquals(4, library.getCapacity());
    }

    @Test
    public void canAddBookToLibraryCollection() {
        library.addBookToCollection(book1);
        assertTrue(library.getCollection().contains(book1));

    }

    @Test
    public void cannotAddBookOnceCapacityReached() {
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        library.addBookToCollection(book3);
        library.addBookToCollection(book4);
        library.addBookToCollection(book5);
        assertTrue(library.getCollection().contains(book1));
        assertTrue(library.getCollection().contains(book2));
        assertTrue(library.getCollection().contains(book3));
        assertTrue(library.getCollection().contains(book4));
        assertFalse(library.getCollection().contains(book5));
    }

    @Test
    public void bookCollectionIncreasesInSizeWhenBooksAdded(){
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        library.addBookToCollection(book5);
        assertEquals(3,library.getBookCount());
    }

    @Test
    public void bookCanBeRemovedFromCollection(){
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        library.removeBook(book1);
        assertTrue(library.getCollection().contains(book2));
        assertFalse(library.getCollection().contains(book1));
        assertEquals(1,library.getBookCount());

    }

}
