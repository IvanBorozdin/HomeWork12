package HW12;

import HW12.Author;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, year);
    }
}
