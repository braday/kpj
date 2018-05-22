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

    private String message;
    
    public Users() {
    }

    public ArrayList<User> getList() {
        return list;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }
    
    public void addUser(User user) {
        list.add(user);
    }

    public void removeUser(User user) {
        list.remove(user);
    }

    public User login(String email, String password) {
        // For each user in the list...
        for (User user : list) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user; // Login correct. Return this user.
            }
        }
        return null; // Login incorrect. Return null.
    }

    public boolean isExistingEmail(String email) throws EmailException {
        for (User user : list) {
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
        for (User user : list) {
            String email = user.getEmail();
            String password = user.getPassword();
            String message = user.getMessage();


            if (!email.matches("\\w+@\\w+\\.\\w+")) {
                message = "invalid email!";
                return false;
            }

            if (password.length() < 4) {
                message = "errrr";
                return false;
            } else if (!password.matches("\\w*\\s+\\w*")) {
                //char contains space
                message = "contains space!!!";
                return false;
            }
        }

        // after check all validate,then return ture;
        return true;
    }

}
