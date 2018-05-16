/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.wsd;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

/**
 *
 * @author Patty
 */
@XmlAccessorType(XmlAccessType.FIELD) // Use the defaults for fields
public class Book implements Serializable {

    @XmlAttribute(name = "id")
    private int id;
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "category")
    private String category;
    @XmlElement(name = "author")
    private String author;
    @XmlElement(name = "price")
    private double price;
    @XmlElement(name = "copy")
    private int copy;

    public Book(int id, String title, String category, String author, double price, int copy) {
//        super();
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.price = price;
        this.copy = copy;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the copy
     */
    public int getCopy() {
        return copy;
    }

    /**
     * @param copy the copy to set
     */
    public void setCopy(int copy) {
        this.copy = copy;
    }

}
