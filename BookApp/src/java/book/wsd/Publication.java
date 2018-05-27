/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.wsd;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Putty
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "publication", namespace = "http://www.uts.edu.au/31284/wsd-books")
public class Publication implements Serializable {

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

    public Publication() {
    }

    public Publication(String description, String isbn, String edition, int pubYear, String publisher) {
        this.description = description;
        this.isbn = isbn;
        this.edition = edition;
        this.pubYear = pubYear;
        this.publisher = publisher;
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
}
