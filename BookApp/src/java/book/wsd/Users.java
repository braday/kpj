/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.wsd;

import java.io.Serializable;
import java.util.ArrayList;
import javax.xml.bind.annotation.*;

/**
 *
 * @author Putty
 */

/*
    This is for add new lister/users
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "users")
public class Users implements Serializable {

    /*
     user element on the user.java class, if has attribute, 
     go into <user id=0><name>bob</name</user>
     */
    @XmlElement(name = "user")
    private ArrayList<User> list = new ArrayList<User>();

    /**
     * @return the list
     */
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

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<User> list) {
        this.list = list;
    }

}
