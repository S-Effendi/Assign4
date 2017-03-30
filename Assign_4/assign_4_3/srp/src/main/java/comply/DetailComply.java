package comply;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class DetailComply {
    BookComply book;

    public DetailComply(BookComply book) {
        this.book = book;
    }

    public void print() {
        System.out.println("Title: "+ book.getName()+ "\nAuthor: "+ book.getAuthor()+ "\nYear Published: "+ book.getYearPublished());
    }
}
