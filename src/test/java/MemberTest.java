import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    private Member member;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before(){
        member = new Member();
        library = new Library(5);
        book1 = new Book("Blood of the Elves", "Andrzej Sapkowski", "Fantasy");
        book2 = new Book("Dune", "Frank Herbert", "Fantasy");
        book3 = new Book("Art of War", "Sun Tzu", "Military art");
        book4 = new Book("The Gulag Archipelago", "Aleksandr Solzhenitsyn", "History");
        book5 = new Book("12 Rules for Life: An Antidote to Chaos ", "Jordan Peterson", "Self Development");
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        library.addBookToCollection(book3);
        library.addBookToCollection(book4);
        library.addBookToCollection(book5);

    }

    @Test
    public void memeberBorrowedBooksHasSize0onInitiation(){
        assertEquals(0,member.getBookCount());
    }

    @Test
    public void memberCanAddABookToBorrowedBooksFromLibraryCollection(){
        member.borrowBook(library, book1);
        assertEquals(1,member.getBookCount());
        assertEquals(4,library.getBookCount());
        assertFalse(library.getCollection().contains(book1));
        assertTrue(library.getCollection().contains(book2));
    }

    @Test
    public void cannotBorrowABookThatIsNotInTheLibraryCollection(){
        member.borrowBook(library, book1);
        member.borrowBook(library, book1);
        assertEquals(1,member.getBookCount());
        assertEquals(4,library.getBookCount());
        assertFalse(library.getCollection().contains(book1));
        assertTrue(library.getCollection().contains(book2));


    }
}
