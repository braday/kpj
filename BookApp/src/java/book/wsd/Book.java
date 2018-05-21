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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "book")
public class Book implements Serializable {

    @XmlAttribute(name = "id")
    private int id;
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "author")
    private String author;
    @XmlElement(name = "category")
    private String category;
    @XmlElement(name = "qty")
    private int qty;
    @XmlElement(name = "price")
    private double price;
    @XmlElement(name = "condition")
    private String condition;
    @XmlElement(name = "publication")
    private Publication publication;
    
    public Book() {
        
    }

    public Book(int id, String title, String author, String category, int qty, double price, String condition, Publication publication) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.qty = qty;
        this.price = price;
        this.condition = condition;
        this.publication = publication;
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
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
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
     * @return the condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

}
