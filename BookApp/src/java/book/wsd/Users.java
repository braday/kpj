/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.wsd;

import book.wsd.dom.BooksPrinter;
import java.util.*;
import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "users")
public class Users implements Serializable {

    // The list of user elements does NOT have an extra wrapper element.
    // See the comment in the XML file, and compare to the bookshop example.
    @XmlElement(name = "user")
    private ArrayList<User> list = new ArrayList<User>();

//    private String message;
    public Users() {
    }

    public ArrayList<User> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<User> list) {
        this.list = list;
    }

    /**
     * @return the message
     */
//    public String getMessage() {
//        return message;
//    }
    public void addUser(User user) {
        getList().add(user);
    }

    public void removeUser(User user) {
        getList().remove(user);
    }

    public User login(String email, String password) {
        // For each user in the list...
        for (User user : getList()) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user; // Login correct. Return this user.
            }
        }
        return null; // Login incorrect. Return null.
    }

    public boolean isExistingEmail(String email) throws EmailException {
        for (User user : getList()) {
            try {
                if (user.getEmail().equals(email)) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new EmailException();
            }
        }
        return false;
    }

    public boolean validate() {
        for (User user : getList()) { // get the user list
            if (user.validate()) {
                return true;
            }
        }
        return false;
    }
    
    public String validateMsg(){
        for (User user : list) {
            return user.getMessage();
        }
        return null;
    }

    public static void main(String[] args) {

        User user = new User("jess@123.com", "jess", "123 abc");

        if (user.validate()) {
            System.out.println("ok???");
        } else {
            System.out.println(user.getMessage());
        }
    }
}
