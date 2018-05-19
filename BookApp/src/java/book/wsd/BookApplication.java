package book.wsd;

import java.io.*;
import javax.xml.bind.*;

public class BookApplication {

    public BookApplication() {
    }

    // Two Properties
    private String filePath;
    private Books books;

    public BookApplication(String filePath, Books books) {
        this.filePath = filePath;
        this.books = books;
    }

    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) throws Exception {
        this.filePath = filePath;
        // Create the unmarshaller
        JAXBContext jc = JAXBContext.newInstance(Books.class);
        Unmarshaller u = jc.createUnmarshaller();

        // Now unmarshal the object from the file
        FileInputStream fin = new FileInputStream(filePath);
        books = (Books) u.unmarshal(fin); // This loads the "books" object
        fin.close();
    }
    public void upadateXML(Books books, String filePath) throws Exception {
        this.books = books;
        this.filePath = filePath;
        JAXBContext jc = JAXBContext.newInstance(Books.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        FileOutputStream fout = new FileOutputStream(filePath);
        m.marshal(books, fout);
        fout.close();
    }

    // For the advanced step, you might consider adding a saveStudents() method here
    // to be used from the welcome.jsp page
//    public void saveBooks() throws JAXBException, IOException {
//        JAXBContext jc = JAXBContext.newInstance(Books.class);
//        Marshaller m = jc.createMarshaller();
//        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        FileOutputStream fout = new FileOutputStream(filePath);
//        m.marshal(books, fout);
//        fout.close();
//    }
    /**
     * @return the books
     */
    public Books getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(Books books) {
        this.books = books;
    }

}
