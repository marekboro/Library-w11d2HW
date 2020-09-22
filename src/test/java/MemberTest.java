import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MemberTest {

    private Member member;

    @Before
    public void before(){
        member = new Member();
    }

    @Test
    public void memeberBorrowedBooksHasSize0onInitiation(){
        assertEquals(0,member.getBookCount());
    }
}
