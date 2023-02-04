package HW12;

import HW12.Author;
import HW12.Book;

public class Main {

    public static void main(String[] args) {
        Author author=new Author("Федор" ,"Достоеыский");
        Author author1=new Author("Лев","Толстой");
        System.out.println();
        Book book= new Book("Идиот",1869, author);
        Book book1= new Book("Анна Каренина",1877, author1);
        System.out.println("Названия книги = " + book.getNameBook());
        System.out.println("Автор = "+author.getName() +" "+author.getSurname());
        System.out.println("Год выпуска = " + book.getYear());
        System.out.println("Названия книги = " + book1.getNameBook());
        System.out.println("Автор = "+author1.getName()+" "+ author1.getSurname() );
        System.out.println("Год выпуска = " + book1.getYear());
        book1.setYear(1878);
        System.out.println("Переиздания = " + book1.getYear());

    }
}