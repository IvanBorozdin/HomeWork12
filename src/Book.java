public class Book {
    public String nameBook;
    public Author author;
    public int year;
    public Book(String nameBook, int year,Author author){
        this.nameBook = nameBook;
        this.year = year;
        this.author = author;

    }
    public String getNameBook(){
        return this.nameBook;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year=year;
    }
}
