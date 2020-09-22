public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String title,String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getGenre() {
        return this.genre;
    }

    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (title == null ? 0 : title.hashCode());
        hash = 31 * hash + (author == null ? 0 : author.hashCode());
        hash = 31 * hash + (genre == null ? 0 : genre.hashCode());

       return hash;
    }

    public int equals(){
        return 2;
    }



}
