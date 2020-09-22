import java.util.ArrayList;

public class Library {
    // Attributes
    private ArrayList<Book> bookCollection;
    private int capacity;

    //constructor
    public Library(int capacity) {
        this.bookCollection = new ArrayList<>();
        this.capacity = capacity;
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

    public int getBookCount(){
        return this.bookCollection.size();
    }


}


