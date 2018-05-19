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
    @XmlElement(name = "author")
    private String author;
    @XmlElement(name = "category")
    private String category;
    @XmlElement(name = "qty")
    private int qty;
    @XmlElement(name = "description")
    private String description;
    @XmlElement(name = "isbn")
    private String isbn;
    @XmlElement(name = "edition")
    private String edition;
    @XmlElement(name = "pubYear")
    private int pubYear;
    @XmlElement(name = "publisher")
    private String publisher;
    @XmlElement(name = "condition")
    private String condition;
    @XmlElement(name = "price")
    private double price;

    public Book(int id, String title, String author, String category, int qty, String description, String isbn, String edition, int pubYear, String publisher, String condition, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.qty = qty;
        this.description = description;
        this.isbn = isbn;
        this.edition = edition;
        this.pubYear = pubYear;
        this.publisher = publisher;
        this.condition = condition;
        this.price = price;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the edition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * @return the pubYear
     */
    public int getPubYear() {
        return pubYear;
    }

    /**
     * @param pubYear the pubYear to set
     */
    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
    

}
