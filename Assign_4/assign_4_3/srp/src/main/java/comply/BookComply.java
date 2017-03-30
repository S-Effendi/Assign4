package comply;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class BookComply {
    private String name;
    private String author;
    private int yearPublished;

    public BookComply(String name, String author, int yearPublished){
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearPublished(){
        return yearPublished;
    }
}
