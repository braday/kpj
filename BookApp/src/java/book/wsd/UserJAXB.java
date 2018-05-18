/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.wsd;

import java.util.*;
import java.io.*;
import javax.xml.bind.*;

public class UserJAXB implements Serializable {
/*
    Note that unlike the bookshop example which had
    an extra element wrapping around all of the books,
    there is no extra wrapper element this time.
 */

    public static void main(String[] args) throws Exception {
        Users users = new Users();
        users.addUser(new User("ryan@ryanheise.com", "Ryan Heise", "blahblah"));
        users.addUser(new User("joe@bloggs.com", "Joe Bloggs", "foobar"));
        users.addUser(new User("jess@123.com", "Jess Doe", "jess"));
        // Boilerplate code to convert objects to XML...
        JAXBContext jc = JAXBContext.newInstance(Users.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(users, System.out);
    }
}
