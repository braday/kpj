/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.wsd;

import java.util.*;
import java.io.*;
import javax.xml.bind.*;

public class BookJAXB implements Serializable {

    public static void main(String[] args) throws Exception {
        Books bookshop = new Books();
        Publication publication1 = new Publication("a computer book", "978-3-16-148410-0", "3rd edition", 2014, "wiley");
        Publication publication2 = new Publication("a health book", "988-1-70-146450-3", "5th edition", 2015, "wiley");
        Publication publication3 = new Publication("a law book", "988-1-70-146450-3", "7th edition", 2015, "wiley");

        bookshop.addBook(new Book(1, "XML Developer's Guide", "Matthew Gambardella", "Computer", 3, 40.0, "Good", publication1));
        bookshop.addBook(new Book(2, "Exercise Physiology", "Mcardle", "Health", 1, 35.0, "fair", publication2));
        bookshop.addBook(new Book(3, "The New Law of Torts", "Danuta Mendelson", "Legal", 2, 55.0, "fair", publication3));

 //Boilerplate code to convert objects to XML...
        JAXBContext jc = JAXBContext.newInstance(Books.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(bookshop, System.out);
    }
}

