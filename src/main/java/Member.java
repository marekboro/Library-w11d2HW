import java.util.ArrayList;

public class Member {

        private ArrayList<Book> borrowedBooks;

        public Member(){
            this.borrowedBooks = new ArrayList<>();
        }

        public int getBookCount(){
            return this.borrowedBooks.size();
        }

        public void borrowBook(Library library, Book book){
            if (library.getCollection().contains(book)){
                library.removeBook(book);
                borrowedBooks.add(book);
            }
        }




}
