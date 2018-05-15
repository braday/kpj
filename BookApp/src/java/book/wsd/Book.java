/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.wsd;

import java.io.Serializable;

/**
 *
 * @author Patty
 */
public class Book implements Serializable {

    private String title;
    private String author;
    private double price;
    private int copy;

    public Book(String title, String author, double price, int copy) {
//        super();
        this.title = title;
        this.author = author;
        this.price = price;
        this.copy = copy;
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
