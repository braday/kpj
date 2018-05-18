/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.wsd;

import java.io.*;
import javax.xml.bind.*;

/**
 * Application that allows its users to login and edit personal diary entries
 * (e.g. a blog), book. This bean is intended to be used within a JSP page at
 * the "application" scope.
 */
public class UserApplication {

    public UserApplication() {
    }

    // Two Properties
    private String filePath;
    private Users users;

    public UserApplication(String filePath, Users users) {
//        super();
        this.filePath = filePath;
        this.users = users;
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
    /*
    * Attempt to load the list of users/books from the XML file at the location filePath,
    * and then store the loaded users/books object into the users/books property.
     */
    public void setFilePath(String filePath) throws Exception {
        this.filePath = filePath;
        // Create the unmarshaller
        JAXBContext jc = JAXBContext.newInstance(Users.class);
        Unmarshaller u = jc.createUnmarshaller();

        // Now unmarshal the object from the file
        FileInputStream fin = new FileInputStream(filePath);
        users = (Users) u.unmarshal(fin); // This loads the "users" object
        fin.close();
    }

    public void upadateXML(Users users, String filePath) throws Exception {
        this.users = users;
        this.filePath = filePath;
        JAXBContext jc = JAXBContext.newInstance(Users.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        FileOutputStream fout = new FileOutputStream(filePath);
        m.marshal(users, fout);
        fout.close();
    }

    /**
     * @return the users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(Users users) {
        this.users = users;
    }

}
