import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Blood of the Elves","Andrzej Sapkowski", "Fantasy");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Blood of the Elves",book.getTitle());
    }
    public void bookHasAuthor(){
        assertEquals("Blood of the Elves",book.getAuthor());
    }
    public void bookHasGenre(){
        assertEquals("Blood of the Elves",book.getGenre());
    }

}
