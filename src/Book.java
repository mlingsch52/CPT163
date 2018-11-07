public class Book {

    private String title, author, publisher;
    private int copiesSold;

    Book(String title, String author, String publisher, int copiesSold){

        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setCopiesSold(copiesSold);
    }

    public void setTitle(String t){
        title = t;
    }

    public void setAuthor(String a){
        author= a;
    }
    public void setPublisher(String p){
        publisher = p;
    }
    public void setCopiesSold(int c){
        copiesSold = c;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    public int getCopiesSold(){
        return copiesSold;
    }

}
