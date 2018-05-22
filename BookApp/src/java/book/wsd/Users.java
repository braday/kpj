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
import org.hibernate.validator.constraints.Email;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "users")
public class Users implements Serializable {

    // The list of user elements does NOT have an extra wrapper element.
    // See the comment in the XML file, and compare to the bookshop example.
    @XmlElement(name = "user")
    private ArrayList<User> list = new ArrayList<User>();

    public Users() {
    }

    public ArrayList<User> getList() {
        return list;
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
}
