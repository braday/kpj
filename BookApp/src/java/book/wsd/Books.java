/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.wsd;

import java.io.Serializable;
import java.util.*;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "bookshop")
public class Books implements Serializable {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "book")
    private List<Book> books = new ArrayList<Book>();

    public Books() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the books
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

}
