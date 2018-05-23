/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.wsd;

import java.io.Serializable;
import java.util.*;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD) // Use the defaults for fields
public class User implements Serializable {
// The defaults are OK
// Each of these fields will be automatically mapped to an XML Element of the same name.

    @XmlElement(name = "email") // eg. this field will be mapped to an XML element called "email"
    private String email;
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "password")
    private String password;

    private String message;

    public User() {

    }

    public User(String email, String name, String password) {
        super();
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    public boolean validate() {
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
        // after check all validate,then return ture;
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "email=" + email + ", name=" + name + ", password=" + password + '}';
    }

}
