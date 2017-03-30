package violate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class BookViolate {
    private String name;
    private String author;
    private int yearPublished;

    public BookViolate(String name, String author, int yearPublished){
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public int getYearPublished(){
        return yearPublished;
    }
    public void setYearPublished(){
        this.yearPublished = yearPublished;
    }

    public String toString(){
        return "Title: "+ getName()+ "\nAuthor: "+ getAuthor()+ "\nYear Published: "+ getYearPublished();
    }
}
