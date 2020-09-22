import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    // Attributes
    private ArrayList<Book> bookCollection;
    private int capacity;
    private HashMap<String, Integer> genreDB;

    //constructor
    public Library(int capacity) {
        this.bookCollection = new ArrayList<>();
        this.capacity = capacity;
        this.genreDB = new HashMap<String, Integer>();
    }
    //methods


    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Book> getCollection() {
        return this.bookCollection;
    }

    public boolean canAdd() {
        return getBookCount() < this.capacity;
    }


    public void addBookToCollection(Book book) {
        if (canAdd()) {
            this.bookCollection.add(book);
        }
    }

    public int getBookCount() {
        return this.bookCollection.size();
    }

    public void removeBook(Book book) {

        this.bookCollection.remove(book);

//         INTELIJ suggests that this check is redundant! :
//        if (this.bookCollection.contains(book)){
//            this.bookCollection.remove(book);
//        }
    }

    public void populateGenreDB() {
        for (Book book : this.bookCollection) {
            if (genreDB.get(book.getGenre()) == null) {
                this.genreDB.put(book.getGenre(), 1);}
            else  {
                int value = genreDB.get(book.getGenre());
                this.genreDB.remove(book.getGenre());
                this.genreDB.put(book.getGenre(), value + 1);
            }
        }
    }

    public int getHashMapSize(){
        return genreDB.size();
    }

    public HashMap<String, Integer> getGenreDB() {
        return genreDB;
    }
}


