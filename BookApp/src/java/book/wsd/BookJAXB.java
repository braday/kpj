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
        bookshop.addBook(new Book(0, "XML Developer's Guide", "Computer", "Matthew Gambardella", 40.0, 3));
        bookshop.addBook(new Book(1, "Exercise Physiology", "Health", "Mcardle", 35.0, 2));
        bookshop.addBook(new Book(2, "The New Law of Torts", "Legal", "Danuta Mendelson", 78.0, 1));
// Boilerplate code to convert objects to XML...
        JAXBContext jc = JAXBContext.newInstance(Books.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(bookshop, System.out);
    }
}
